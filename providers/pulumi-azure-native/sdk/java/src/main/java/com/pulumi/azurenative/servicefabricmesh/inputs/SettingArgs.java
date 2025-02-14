// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a setting for the container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
 * 
 */
public final class SettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingArgs Empty = new SettingArgs();

    /**
     * The name of the setting.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the setting.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the setting.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the setting.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SettingArgs() {}

    private SettingArgs(SettingArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingArgs $;

        public Builder() {
            $ = new SettingArgs();
        }

        public Builder(SettingArgs defaults) {
            $ = new SettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the setting.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the setting.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the setting.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SettingArgs build() {
            return $;
        }
    }

}
