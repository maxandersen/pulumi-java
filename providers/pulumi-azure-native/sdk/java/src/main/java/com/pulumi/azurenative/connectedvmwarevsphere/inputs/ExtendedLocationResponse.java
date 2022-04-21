// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The extended location.
 * 
 */
public final class ExtendedLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExtendedLocationResponse Empty = new ExtendedLocationResponse();

    /**
     * The extended location name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The extended location type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ExtendedLocationResponse() {}

    private ExtendedLocationResponse(ExtendedLocationResponse $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedLocationResponse $;

        public Builder() {
            $ = new ExtendedLocationResponse();
        }

        public Builder(ExtendedLocationResponse defaults) {
            $ = new ExtendedLocationResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ExtendedLocationResponse build() {
            return $;
        }
    }

}
