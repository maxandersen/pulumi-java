// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Postgres Instance properties.
 * 
 */
public final class PostgresInstancePropertiesArgs extends ResourceArgs {

    public static final PostgresInstancePropertiesArgs Empty = new PostgresInstancePropertiesArgs();

    /**
     * The instance admin
     * 
     */
    @Import(name="admin")
    private @Nullable Output<String> admin;

    /**
     * @return The instance admin
     * 
     */
    public Optional<Output<String>> admin() {
        return Optional.ofNullable(this.admin);
    }

    /**
     * Username and password for basic authentication.
     * 
     */
    @Import(name="basicLoginInformation")
    private @Nullable Output<BasicLoginInformationArgs> basicLoginInformation;

    /**
     * @return Username and password for basic authentication.
     * 
     */
    public Optional<Output<BasicLoginInformationArgs>> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * The data controller id
     * 
     */
    @Import(name="dataControllerId")
    private @Nullable Output<String> dataControllerId;

    /**
     * @return The data controller id
     * 
     */
    public Optional<Output<String>> dataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @Import(name="k8sRaw")
    private @Nullable Output<Object> k8sRaw;

    /**
     * @return The raw kubernetes information
     * 
     */
    public Optional<Output<Object>> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="lastUploadedDate")
    private @Nullable Output<String> lastUploadedDate;

    /**
     * @return Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<Output<String>> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }

    private PostgresInstancePropertiesArgs() {}

    private PostgresInstancePropertiesArgs(PostgresInstancePropertiesArgs $) {
        this.admin = $.admin;
        this.basicLoginInformation = $.basicLoginInformation;
        this.dataControllerId = $.dataControllerId;
        this.k8sRaw = $.k8sRaw;
        this.lastUploadedDate = $.lastUploadedDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostgresInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgresInstancePropertiesArgs $;

        public Builder() {
            $ = new PostgresInstancePropertiesArgs();
        }

        public Builder(PostgresInstancePropertiesArgs defaults) {
            $ = new PostgresInstancePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param admin The instance admin
         * 
         * @return builder
         * 
         */
        public Builder admin(@Nullable Output<String> admin) {
            $.admin = admin;
            return this;
        }

        /**
         * @param admin The instance admin
         * 
         * @return builder
         * 
         */
        public Builder admin(String admin) {
            return admin(Output.of(admin));
        }

        /**
         * @param basicLoginInformation Username and password for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicLoginInformation(@Nullable Output<BasicLoginInformationArgs> basicLoginInformation) {
            $.basicLoginInformation = basicLoginInformation;
            return this;
        }

        /**
         * @param basicLoginInformation Username and password for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder basicLoginInformation(BasicLoginInformationArgs basicLoginInformation) {
            return basicLoginInformation(Output.of(basicLoginInformation));
        }

        /**
         * @param dataControllerId The data controller id
         * 
         * @return builder
         * 
         */
        public Builder dataControllerId(@Nullable Output<String> dataControllerId) {
            $.dataControllerId = dataControllerId;
            return this;
        }

        /**
         * @param dataControllerId The data controller id
         * 
         * @return builder
         * 
         */
        public Builder dataControllerId(String dataControllerId) {
            return dataControllerId(Output.of(dataControllerId));
        }

        /**
         * @param k8sRaw The raw kubernetes information
         * 
         * @return builder
         * 
         */
        public Builder k8sRaw(@Nullable Output<Object> k8sRaw) {
            $.k8sRaw = k8sRaw;
            return this;
        }

        /**
         * @param k8sRaw The raw kubernetes information
         * 
         * @return builder
         * 
         */
        public Builder k8sRaw(Object k8sRaw) {
            return k8sRaw(Output.of(k8sRaw));
        }

        /**
         * @param lastUploadedDate Last uploaded date from Kubernetes cluster. Defaults to current date time
         * 
         * @return builder
         * 
         */
        public Builder lastUploadedDate(@Nullable Output<String> lastUploadedDate) {
            $.lastUploadedDate = lastUploadedDate;
            return this;
        }

        /**
         * @param lastUploadedDate Last uploaded date from Kubernetes cluster. Defaults to current date time
         * 
         * @return builder
         * 
         */
        public Builder lastUploadedDate(String lastUploadedDate) {
            return lastUploadedDate(Output.of(lastUploadedDate));
        }

        public PostgresInstancePropertiesArgs build() {
            return $;
        }
    }

}
