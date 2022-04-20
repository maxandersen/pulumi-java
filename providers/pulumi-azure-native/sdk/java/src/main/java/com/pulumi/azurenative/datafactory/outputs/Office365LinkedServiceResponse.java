// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Office365LinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final Object office365TenantId;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
     * 
     */
    private final Object servicePrincipalId;
    /**
     * Specify the application&#39;s key.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression with resultType string).
     * 
     */
    private final Object servicePrincipalTenantId;
    /**
     * Type of linked service.
     * Expected value is &#39;Office365&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private Office365LinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("office365TenantId") Object office365TenantId,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("servicePrincipalId") Object servicePrincipalId,
        @CustomType.Parameter("servicePrincipalKey") Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @CustomType.Parameter("servicePrincipalTenantId") Object servicePrincipalTenantId,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.office365TenantId = office365TenantId;
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.servicePrincipalTenantId = servicePrincipalTenantId;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     * 
    */
    public Object office365TenantId() {
        return this.office365TenantId;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
     * 
    */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * Specify the application&#39;s key.
     * 
    */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey() {
        return this.servicePrincipalKey;
    }
    /**
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression with resultType string).
     * 
    */
    public Object servicePrincipalTenantId() {
        return this.servicePrincipalTenantId;
    }
    /**
     * Type of linked service.
     * Expected value is &#39;Office365&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object office365TenantId;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object servicePrincipalId;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private Object servicePrincipalTenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365LinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.office365TenantId = defaults.office365TenantId;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.servicePrincipalTenantId = defaults.servicePrincipalTenantId;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder office365TenantId(Object office365TenantId) {
            this.office365TenantId = Objects.requireNonNull(office365TenantId);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder servicePrincipalId(Object servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
            return this;
        }
        public Builder servicePrincipalTenantId(Object servicePrincipalTenantId) {
            this.servicePrincipalTenantId = Objects.requireNonNull(servicePrincipalTenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public Office365LinkedServiceResponse build() {
            return new Office365LinkedServiceResponse(annotations, connectVia, description, encryptedCredential, office365TenantId, parameters, servicePrincipalId, servicePrincipalKey, servicePrincipalTenantId, type);
        }
    }
}
