// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class GoogleCloudRunOpV2EnvVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2EnvVarArgs Empty = new GoogleCloudRunOpV2EnvVarArgs();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;, and the maximum length is 32768 bytes.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Source for the environment variable&#39;s value.
     * 
     */
    @Import(name="valueSource")
    private @Nullable Output<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource;

    public Optional<Output<GoogleCloudRunOpV2EnvVarSourceArgs>> valueSource() {
        return Optional.ofNullable(this.valueSource);
    }

    private GoogleCloudRunOpV2EnvVarArgs() {}

    private GoogleCloudRunOpV2EnvVarArgs(GoogleCloudRunOpV2EnvVarArgs $) {
        this.name = $.name;
        this.value = $.value;
        this.valueSource = $.valueSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunOpV2EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2EnvVarArgs $;

        public Builder() {
            $ = new GoogleCloudRunOpV2EnvVarArgs();
        }

        public Builder(GoogleCloudRunOpV2EnvVarArgs defaults) {
            $ = new GoogleCloudRunOpV2EnvVarArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
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

        public Builder valueSource(@Nullable Output<GoogleCloudRunOpV2EnvVarSourceArgs> valueSource) {
            $.valueSource = valueSource;
            return this;
        }

        public Builder valueSource(GoogleCloudRunOpV2EnvVarSourceArgs valueSource) {
            return valueSource(Output.of(valueSource));
        }

        public GoogleCloudRunOpV2EnvVarArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
