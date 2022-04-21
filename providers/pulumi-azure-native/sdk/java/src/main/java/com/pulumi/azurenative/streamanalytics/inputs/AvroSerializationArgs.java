// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in Avro format.
 * 
 */
public final class AvroSerializationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvroSerializationArgs Empty = new AvroSerializationArgs();

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Avro&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AvroSerializationArgs() {}

    private AvroSerializationArgs(AvroSerializationArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AvroSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvroSerializationArgs $;

        public Builder() {
            $ = new AvroSerializationArgs();
        }

        public Builder(AvroSerializationArgs defaults) {
            $ = new AvroSerializationArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AvroSerializationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
