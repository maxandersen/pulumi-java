// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A product label represented as a key-value pair.
 * 
 */
public final class KeyValueResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyValueResponse Empty = new KeyValueResponse();

    /**
     * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private KeyValueResponse() {}

    private KeyValueResponse(KeyValueResponse $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyValueResponse $;

        public Builder() {
            $ = new KeyValueResponse();
        }

        public Builder(KeyValueResponse defaults) {
            $ = new KeyValueResponse(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public KeyValueResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
