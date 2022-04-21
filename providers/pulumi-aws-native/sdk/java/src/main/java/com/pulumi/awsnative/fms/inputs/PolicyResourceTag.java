// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.fms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A resource tag.
 * 
 */
public final class PolicyResourceTag extends com.pulumi.resources.InvokeArgs {

    public static final PolicyResourceTag Empty = new PolicyResourceTag();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private PolicyResourceTag() {}

    private PolicyResourceTag(PolicyResourceTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyResourceTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyResourceTag $;

        public Builder() {
            $ = new PolicyResourceTag();
        }

        public Builder(PolicyResourceTag defaults) {
            $ = new PolicyResourceTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public PolicyResourceTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
