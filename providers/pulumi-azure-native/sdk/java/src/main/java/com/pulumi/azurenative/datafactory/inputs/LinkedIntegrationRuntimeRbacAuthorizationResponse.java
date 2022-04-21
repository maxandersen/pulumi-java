// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The role based access control (RBAC) authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeRbacAuthorizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeRbacAuthorizationResponse Empty = new LinkedIntegrationRuntimeRbacAuthorizationResponse();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
    private String authorizationType;

    public String authorizationType() {
        return this.authorizationType;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    public String resourceId() {
        return this.resourceId;
    }

    private LinkedIntegrationRuntimeRbacAuthorizationResponse() {}

    private LinkedIntegrationRuntimeRbacAuthorizationResponse(LinkedIntegrationRuntimeRbacAuthorizationResponse $) {
        this.authorizationType = $.authorizationType;
        this.credential = $.credential;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedIntegrationRuntimeRbacAuthorizationResponse $;

        public Builder() {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationResponse();
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationResponse(Objects.requireNonNull(defaults));
        }

        public Builder authorizationType(String authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            $.credential = credential;
            return this;
        }

        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public LinkedIntegrationRuntimeRbacAuthorizationResponse build() {
            $.authorizationType = Codegen.stringProp("authorizationType").arg($.authorizationType).require();
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
