// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
     * 
     */
    @Import(name="containerAccessType")
    private @Nullable Output<String> containerAccessType;

    /**
     * @return The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
     * 
     */
    public Optional<Output<String>> containerAccessType() {
        return Optional.ofNullable(this.containerAccessType);
    }

    /**
     * A mapping of MetaData for this Container. All metadata keys should be lowercase.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A mapping of MetaData for this Container. All metadata keys should be lowercase.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the Container which should be created within the Storage Account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Container which should be created within the Storage Account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Storage Account where the Container should be created.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return The name of the Storage Account where the Container should be created.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    private ContainerArgs() {}

    private ContainerArgs(ContainerArgs $) {
        this.containerAccessType = $.containerAccessType;
        this.metadata = $.metadata;
        this.name = $.name;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerArgs $;

        public Builder() {
            $ = new ContainerArgs();
        }

        public Builder(ContainerArgs defaults) {
            $ = new ContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerAccessType The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
         * 
         * @return builder
         * 
         */
        public Builder containerAccessType(@Nullable Output<String> containerAccessType) {
            $.containerAccessType = containerAccessType;
            return this;
        }

        /**
         * @param containerAccessType The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
         * 
         * @return builder
         * 
         */
        public Builder containerAccessType(String containerAccessType) {
            return containerAccessType(Output.of(containerAccessType));
        }

        /**
         * @param metadata A mapping of MetaData for this Container. All metadata keys should be lowercase.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A mapping of MetaData for this Container. All metadata keys should be lowercase.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name of the Container which should be created within the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Container which should be created within the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountName The name of the Storage Account where the Container should be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account where the Container should be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public ContainerArgs build() {
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            return $;
        }
    }

}
