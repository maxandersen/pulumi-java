// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;


/**
 * Filter First Quality
 * 
 */
public final class FirstQualityArgs extends ResourceArgs {

    public static final FirstQualityArgs Empty = new FirstQualityArgs();

    /**
     * The first quality bitrate.
     * 
     */
    @Import(name="bitrate", required=true)
    private Output<Integer> bitrate;

    /**
     * @return The first quality bitrate.
     * 
     */
    public Output<Integer> bitrate() {
        return this.bitrate;
    }

    private FirstQualityArgs() {}

    private FirstQualityArgs(FirstQualityArgs $) {
        this.bitrate = $.bitrate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirstQualityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirstQualityArgs $;

        public Builder() {
            $ = new FirstQualityArgs();
        }

        public Builder(FirstQualityArgs defaults) {
            $ = new FirstQualityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bitrate The first quality bitrate.
         * 
         * @return builder
         * 
         */
        public Builder bitrate(Output<Integer> bitrate) {
            $.bitrate = bitrate;
            return this;
        }

        /**
         * @param bitrate The first quality bitrate.
         * 
         * @return builder
         * 
         */
        public Builder bitrate(Integer bitrate) {
            return bitrate(Output.of(bitrate));
        }

        public FirstQualityArgs build() {
            $.bitrate = Objects.requireNonNull($.bitrate, "expected parameter 'bitrate' to be non-null");
            return $;
        }
    }

}
