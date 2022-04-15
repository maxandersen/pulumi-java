// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxSecretResponse;
import io.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataboxJobSecretsResponse {
    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    /**
     * Error while fetching the secrets.
     * 
     */
    private final CloudErrorResponse error;
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBox'.
     * 
     */
    private final String jobSecretsType;
    /**
     * Contains the list of secret objects for a job.
     * 
     */
    private final @Nullable List<DataBoxSecretResponse> podSecrets;

    @CustomType.Constructor
    private DataboxJobSecretsResponse(
        @CustomType.Parameter("dcAccessSecurityCode") DcAccessSecurityCodeResponse dcAccessSecurityCode,
        @CustomType.Parameter("error") CloudErrorResponse error,
        @CustomType.Parameter("jobSecretsType") String jobSecretsType,
        @CustomType.Parameter("podSecrets") @Nullable List<DataBoxSecretResponse> podSecrets) {
        this.dcAccessSecurityCode = dcAccessSecurityCode;
        this.error = error;
        this.jobSecretsType = jobSecretsType;
        this.podSecrets = podSecrets;
    }

    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
    */
    public DcAccessSecurityCodeResponse dcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }
    /**
     * Error while fetching the secrets.
     * 
    */
    public CloudErrorResponse error() {
        return this.error;
    }
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBox'.
     * 
    */
    public String jobSecretsType() {
        return this.jobSecretsType;
    }
    /**
     * Contains the list of secret objects for a job.
     * 
    */
    public List<DataBoxSecretResponse> podSecrets() {
        return this.podSecrets == null ? List.of() : this.podSecrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataboxJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private CloudErrorResponse error;
        private String jobSecretsType;
        private @Nullable List<DataBoxSecretResponse> podSecrets;

        public Builder() {
    	      // Empty
        }

        public Builder(DataboxJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.error = defaults.error;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.podSecrets = defaults.podSecrets;
        }

        public Builder dcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }
        public Builder error(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder jobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }
        public Builder podSecrets(@Nullable List<DataBoxSecretResponse> podSecrets) {
            this.podSecrets = podSecrets;
            return this;
        }
        public Builder podSecrets(DataBoxSecretResponse... podSecrets) {
            return podSecrets(List.of(podSecrets));
        }        public DataboxJobSecretsResponse build() {
            return new DataboxJobSecretsResponse(dcAccessSecurityCode, error, jobSecretsType, podSecrets);
        }
    }
}
