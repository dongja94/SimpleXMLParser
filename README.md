# SimpleXMLParser
Simple XML Parser is a simple library for Android for XML Deserialization similar to Google Gson Library.
Use the Tag name of the XML Element and Attribute names like Gson in turn to match the name of the class field.

##Usage
    <rss>
        <channel>
            <title>test</title>
            <item>
                <title>item 1</title>
            <item>
            <item>
                <title>item 2</title>
            <item>
        </channel>
    </rss>
XML Data

    public class Channel {
        String title;
        ArrayList<Item> item;
    }
    
    public class Item {
        String title;
    }
Data class
Element appear repeatedly when you define a data class can use the Array or ArrayList. gson but in this case it is not available List List of available defined using the ArrayList.

It generates data to fromXML () of XMLParser. The second argument is the name of the XML Element fill the data object.

    InputStream is = conn.getInputStrea(); // XML Data InputStream
    XMLParser parser = new XMLParser();
    Channel channel = parser.fromXML(is, "channel", Channel.class);

Element of different people can use the Tag name field @SerializedName annotation.

    public class Channel {
        String title;
        @SerializedName("item")
        ArrayList<Item> items;
    }

To collect Element attribute gives the  name in the field of the class, such as the attribute name of Element.

    <jobs count="10" start="0" total="169475">
        <job> ... </job>
        <job> ... </job>
        ...
    </jobs>
XML

    public class Jobs {
        String total;
        @Attribute
        String start;
        @SerializedName("count")
        String display;
        @SerializedName("job")
        ArrayList<Job> jobs;
    }
data class
Using @Attribute can explicitly specify that collects the value of the attribute. And it can be used @SerializedName.

If the attribute and text value exists, you cant use the @DefaultValueField annotation to collect a text value.

    <name href="http://www.google.com">
        google
    </name>
XML

    public class CompanyName {
        @SerializedName("href")
        String link;
        @DefaultValueField
        String name;
    }
data class

##Download
In a Maven project include the dependency:

    <dependency>
        <groupId>com.begentgroup.xmlparser</groupId>
        <artifactId>simple-xml-parser</artifactId>
        <version>0.1.2</version>
    </dependency>
Gradle :

    compile 'com.begentgroup.xmlparser:simple-xml-parser:0.1.2'

##License

    Copyright 2016 Simple XML Parser.
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
      http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
  
</dependency>
