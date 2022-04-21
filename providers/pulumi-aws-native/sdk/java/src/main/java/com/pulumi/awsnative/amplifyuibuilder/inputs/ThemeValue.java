// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder.inputs;

import com.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValues;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeValue extends com.pulumi.resources.InvokeArgs {

    public static final ThemeValue Empty = new ThemeValue();

    @Import(name="children")
    private @Nullable List<ThemeValues> children;

    public Optional<List<ThemeValues>> children() {
        return Optional.ofNullable(this.children);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private ThemeValue() {}

    private ThemeValue(ThemeValue $) {
        this.children = $.children;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeValue $;

        public Builder() {
            $ = new ThemeValue();
        }

        public Builder(ThemeValue defaults) {
            $ = new ThemeValue(Objects.requireNonNull(defaults));
        }

        public Builder children(@Nullable List<ThemeValues> children) {
            $.children = children;
            return this;
        }

        public Builder children(ThemeValues... children) {
            return children(List.of(children));
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public ThemeValue build() {
            return $;
        }
    }

}
