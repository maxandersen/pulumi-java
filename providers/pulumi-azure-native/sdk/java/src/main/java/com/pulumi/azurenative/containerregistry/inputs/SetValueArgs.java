// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a overridable value that can be passed to a task template.
 * 
 */
public final class SetValueArgs extends ResourceArgs {

    public static final SetValueArgs Empty = new SetValueArgs();

    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    @Import(name="isSecret")
    private @Nullable Output<Boolean> isSecret;

    /**
     * @return Flag to indicate whether the value represents a secret or not.
     * 
     */
    public Optional<Output<Boolean>> isSecret() {
        return Optional.ofNullable(this.isSecret);
    }

    /**
     * The name of the overridable value.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the overridable value.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The overridable value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The overridable value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SetValueArgs() {}

    private SetValueArgs(SetValueArgs $) {
        this.isSecret = $.isSecret;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SetValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SetValueArgs $;

        public Builder() {
            $ = new SetValueArgs();
        }

        public Builder(SetValueArgs defaults) {
            $ = new SetValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isSecret Flag to indicate whether the value represents a secret or not.
         * 
         * @return builder
         * 
         */
        public Builder isSecret(@Nullable Output<Boolean> isSecret) {
            $.isSecret = isSecret;
            return this;
        }

        /**
         * @param isSecret Flag to indicate whether the value represents a secret or not.
         * 
         * @return builder
         * 
         */
        public Builder isSecret(Boolean isSecret) {
            return isSecret(Output.of(isSecret));
        }

        /**
         * @param name The name of the overridable value.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the overridable value.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The overridable value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The overridable value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SetValueArgs build() {
            $.isSecret = Codegen.booleanProp("isSecret").output().arg($.isSecret).def(false).getNullable();
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
