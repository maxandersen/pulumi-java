// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsCustomFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigCounterOptionsCustomFieldArgs Empty = new LogConfigCounterOptionsCustomFieldArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private LogConfigCounterOptionsCustomFieldArgs() {}

    private LogConfigCounterOptionsCustomFieldArgs(LogConfigCounterOptionsCustomFieldArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigCounterOptionsCustomFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigCounterOptionsCustomFieldArgs $;

        public Builder() {
            $ = new LogConfigCounterOptionsCustomFieldArgs();
        }

        public Builder(LogConfigCounterOptionsCustomFieldArgs defaults) {
            $ = new LogConfigCounterOptionsCustomFieldArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public LogConfigCounterOptionsCustomFieldArgs build() {
            return $;
        }
    }

}
