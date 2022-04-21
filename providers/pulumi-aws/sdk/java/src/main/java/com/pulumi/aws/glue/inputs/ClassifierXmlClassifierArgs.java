// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClassifierXmlClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassifierXmlClassifierArgs Empty = new ClassifierXmlClassifierArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @Import(name="classification", required=true)
    private Output<String> classification;

    public Output<String> classification() {
        return this.classification;
    }

    /**
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/&gt;`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34;&gt;&lt;/row&gt;` is okay, but `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34; /&gt;` is not).
     * 
     */
    @Import(name="rowTag", required=true)
    private Output<String> rowTag;

    public Output<String> rowTag() {
        return this.rowTag;
    }

    private ClassifierXmlClassifierArgs() {}

    private ClassifierXmlClassifierArgs(ClassifierXmlClassifierArgs $) {
        this.classification = $.classification;
        this.rowTag = $.rowTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassifierXmlClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassifierXmlClassifierArgs $;

        public Builder() {
            $ = new ClassifierXmlClassifierArgs();
        }

        public Builder(ClassifierXmlClassifierArgs defaults) {
            $ = new ClassifierXmlClassifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder classification(Output<String> classification) {
            $.classification = classification;
            return this;
        }

        public Builder classification(String classification) {
            return classification(Output.of(classification));
        }

        public Builder rowTag(Output<String> rowTag) {
            $.rowTag = rowTag;
            return this;
        }

        public Builder rowTag(String rowTag) {
            return rowTag(Output.of(rowTag));
        }

        public ClassifierXmlClassifierArgs build() {
            $.classification = Objects.requireNonNull($.classification, "expected parameter 'classification' to be non-null");
            $.rowTag = Objects.requireNonNull($.rowTag, "expected parameter 'rowTag' to be non-null");
            return $;
        }
    }

}
