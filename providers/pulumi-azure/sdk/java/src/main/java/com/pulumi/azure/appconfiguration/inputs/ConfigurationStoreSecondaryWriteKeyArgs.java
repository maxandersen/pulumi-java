// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationStoreSecondaryWriteKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationStoreSecondaryWriteKeyArgs Empty = new ConfigurationStoreSecondaryWriteKeyArgs();

    /**
     * The Connection String for this Access Key - comprising of the Endpoint, ID and Secret.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The Connection String for this Access Key - comprising of the Endpoint, ID and Secret.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The ID of the Access Key.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Access Key.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Secret of the Access Key.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return The Secret of the Access Key.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private ConfigurationStoreSecondaryWriteKeyArgs() {}

    private ConfigurationStoreSecondaryWriteKeyArgs(ConfigurationStoreSecondaryWriteKeyArgs $) {
        this.connectionString = $.connectionString;
        this.id = $.id;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationStoreSecondaryWriteKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationStoreSecondaryWriteKeyArgs $;

        public Builder() {
            $ = new ConfigurationStoreSecondaryWriteKeyArgs();
        }

        public Builder(ConfigurationStoreSecondaryWriteKeyArgs defaults) {
            $ = new ConfigurationStoreSecondaryWriteKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString The Connection String for this Access Key - comprising of the Endpoint, ID and Secret.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The Connection String for this Access Key - comprising of the Endpoint, ID and Secret.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param id The ID of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param secret The Secret of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Secret of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ConfigurationStoreSecondaryWriteKeyArgs build() {
            return $;
        }
    }

}
