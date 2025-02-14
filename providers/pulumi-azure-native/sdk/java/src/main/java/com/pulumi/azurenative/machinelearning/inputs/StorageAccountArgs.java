// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access information for a storage account.
 * 
 */
public final class StorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * Specifies the key used to access the storage account.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Specifies the key used to access the storage account.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Specifies the name of the storage account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the storage account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private StorageAccountArgs() {}

    private StorageAccountArgs(StorageAccountArgs $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountArgs $;

        public Builder() {
            $ = new StorageAccountArgs();
        }

        public Builder(StorageAccountArgs defaults) {
            $ = new StorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Specifies the key used to access the storage account.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the key used to access the storage account.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Specifies the name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public StorageAccountArgs build() {
            return $;
        }
    }

}
