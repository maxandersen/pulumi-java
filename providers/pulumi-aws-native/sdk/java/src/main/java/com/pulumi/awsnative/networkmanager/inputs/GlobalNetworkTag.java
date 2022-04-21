// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A key-value pair to associate with a global network resource.
 * 
 */
public final class GlobalNetworkTag extends com.pulumi.resources.InvokeArgs {

    public static final GlobalNetworkTag Empty = new GlobalNetworkTag();

    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GlobalNetworkTag() {}

    private GlobalNetworkTag(GlobalNetworkTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalNetworkTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalNetworkTag $;

        public Builder() {
            $ = new GlobalNetworkTag();
        }

        public Builder(GlobalNetworkTag defaults) {
            $ = new GlobalNetworkTag(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GlobalNetworkTag build() {
            return $;
        }
    }

}
