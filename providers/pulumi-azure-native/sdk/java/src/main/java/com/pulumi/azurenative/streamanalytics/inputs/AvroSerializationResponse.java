// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in Avro format.
 * 
 */
public final class AvroSerializationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AvroSerializationResponse Empty = new AvroSerializationResponse();

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Avro&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AvroSerializationResponse(String type) {
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AvroSerializationResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroSerializationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroSerializationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AvroSerializationResponse build() {
            return new AvroSerializationResponse(type);
        }
    }
}
