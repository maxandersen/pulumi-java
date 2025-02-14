// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Tags to be applied to Input.
 * 
 */
public final class DetectorModelTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelTagArgs Empty = new DetectorModelTagArgs();

    /**
     * Key of the Tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key of the Tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Value of the Tag.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the Tag.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DetectorModelTagArgs() {}

    private DetectorModelTagArgs(DetectorModelTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelTagArgs $;

        public Builder() {
            $ = new DetectorModelTagArgs();
        }

        public Builder(DetectorModelTagArgs defaults) {
            $ = new DetectorModelTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the Tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the Tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of the Tag.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the Tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DetectorModelTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
