// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import java.util.Objects;


/**
 * AVRO file format configuration.
 * 
 */
public final class AvroFileFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvroFileFormatArgs Empty = new AvroFileFormatArgs();

    public AvroFileFormatArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroFileFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AvroFileFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public AvroFileFormatArgs build() {
            return new AvroFileFormatArgs();
        }
    }
}
