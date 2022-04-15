// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.azurenative.azurearcdata.outputs.BasicLoginInformationResponse;
import io.pulumi.azurenative.azurearcdata.outputs.LogAnalyticsWorkspaceConfigResponse;
import io.pulumi.azurenative.azurearcdata.outputs.OnPremisePropertyResponse;
import io.pulumi.azurenative.azurearcdata.outputs.UploadServicePrincipalResponse;
import io.pulumi.azurenative.azurearcdata.outputs.UploadWatermarkResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataControllerPropertiesResponse {
    /**
     * Username and password for basic login authentication.
     * 
     */
    private final @Nullable BasicLoginInformationResponse basicLoginInformation;
    /**
     * The raw kubernetes information
     * 
     */
    private final @Nullable Object k8sRaw;
    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String lastUploadedDate;
    /**
     * Log analytics workspace id and primary key
     * 
     */
    private final @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig;
    /**
     * Properties from the Kubernetes data controller
     * 
     */
    private final @Nullable OnPremisePropertyResponse onPremiseProperty;
    private final String provisioningState;
    /**
     * Service principal for uploading billing, metrics and logs.
     * 
     */
    private final @Nullable UploadServicePrincipalResponse uploadServicePrincipal;
    /**
     * Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
     */
    private final @Nullable UploadWatermarkResponse uploadWatermark;

    @CustomType.Constructor
    private DataControllerPropertiesResponse(
        @CustomType.Parameter("basicLoginInformation") @Nullable BasicLoginInformationResponse basicLoginInformation,
        @CustomType.Parameter("k8sRaw") @Nullable Object k8sRaw,
        @CustomType.Parameter("lastUploadedDate") @Nullable String lastUploadedDate,
        @CustomType.Parameter("logAnalyticsWorkspaceConfig") @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig,
        @CustomType.Parameter("onPremiseProperty") @Nullable OnPremisePropertyResponse onPremiseProperty,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("uploadServicePrincipal") @Nullable UploadServicePrincipalResponse uploadServicePrincipal,
        @CustomType.Parameter("uploadWatermark") @Nullable UploadWatermarkResponse uploadWatermark) {
        this.basicLoginInformation = basicLoginInformation;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
        this.onPremiseProperty = onPremiseProperty;
        this.provisioningState = provisioningState;
        this.uploadServicePrincipal = uploadServicePrincipal;
        this.uploadWatermark = uploadWatermark;
    }

    /**
     * Username and password for basic login authentication.
     * 
    */
    public Optional<BasicLoginInformationResponse> basicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }
    /**
     * The raw kubernetes information
     * 
    */
    public Optional<Object> k8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }
    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
    */
    public Optional<String> lastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }
    /**
     * Log analytics workspace id and primary key
     * 
    */
    public Optional<LogAnalyticsWorkspaceConfigResponse> logAnalyticsWorkspaceConfig() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceConfig);
    }
    /**
     * Properties from the Kubernetes data controller
     * 
    */
    public Optional<OnPremisePropertyResponse> onPremiseProperty() {
        return Optional.ofNullable(this.onPremiseProperty);
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Service principal for uploading billing, metrics and logs.
     * 
    */
    public Optional<UploadServicePrincipalResponse> uploadServicePrincipal() {
        return Optional.ofNullable(this.uploadServicePrincipal);
    }
    /**
     * Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
    */
    public Optional<UploadWatermarkResponse> uploadWatermark() {
        return Optional.ofNullable(this.uploadWatermark);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataControllerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BasicLoginInformationResponse basicLoginInformation;
        private @Nullable Object k8sRaw;
        private @Nullable String lastUploadedDate;
        private @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig;
        private @Nullable OnPremisePropertyResponse onPremiseProperty;
        private String provisioningState;
        private @Nullable UploadServicePrincipalResponse uploadServicePrincipal;
        private @Nullable UploadWatermarkResponse uploadWatermark;

        public Builder() {
    	      // Empty
        }

        public Builder(DataControllerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.logAnalyticsWorkspaceConfig = defaults.logAnalyticsWorkspaceConfig;
    	      this.onPremiseProperty = defaults.onPremiseProperty;
    	      this.provisioningState = defaults.provisioningState;
    	      this.uploadServicePrincipal = defaults.uploadServicePrincipal;
    	      this.uploadWatermark = defaults.uploadWatermark;
        }

        public Builder basicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }
        public Builder k8sRaw(@Nullable Object k8sRaw) {
            this.k8sRaw = k8sRaw;
            return this;
        }
        public Builder lastUploadedDate(@Nullable String lastUploadedDate) {
            this.lastUploadedDate = lastUploadedDate;
            return this;
        }
        public Builder logAnalyticsWorkspaceConfig(@Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig) {
            this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
            return this;
        }
        public Builder onPremiseProperty(@Nullable OnPremisePropertyResponse onPremiseProperty) {
            this.onPremiseProperty = onPremiseProperty;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder uploadServicePrincipal(@Nullable UploadServicePrincipalResponse uploadServicePrincipal) {
            this.uploadServicePrincipal = uploadServicePrincipal;
            return this;
        }
        public Builder uploadWatermark(@Nullable UploadWatermarkResponse uploadWatermark) {
            this.uploadWatermark = uploadWatermark;
            return this;
        }        public DataControllerPropertiesResponse build() {
            return new DataControllerPropertiesResponse(basicLoginInformation, k8sRaw, lastUploadedDate, logAnalyticsWorkspaceConfig, onPremiseProperty, provisioningState, uploadServicePrincipal, uploadWatermark);
        }
    }
}
