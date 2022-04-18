// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents an OpenId Connect 1.0 identity provider.
 * 
 */
public final class OidcResponse extends com.pulumi.resources.InvokeArgs {

    public static final OidcResponse Empty = new OidcResponse();

    /**
     * Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange requests are rejected if the token audience does not match one of the configured values. Each audience may be at most 256 characters. A maximum of 10 audiences may be configured. If this list is empty, the OIDC token audience must be equal to the full canonical resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix. For example: ```//iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ https://iam.googleapis.com/projects//locations//workloadIdentityPools//providers/```
     * 
     */
    @Import(name="allowedAudiences", required=true)
      private final List<String> allowedAudiences;

    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * The OIDC issuer URL. Must be an HTTPS endpoint.
     * 
     */
    @Import(name="issuerUri", required=true)
      private final String issuerUri;

    public String issuerUri() {
        return this.issuerUri;
    }

    public OidcResponse(
        List<String> allowedAudiences,
        String issuerUri) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
        this.issuerUri = Objects.requireNonNull(issuerUri, "expected parameter 'issuerUri' to be non-null");
    }

    private OidcResponse() {
        this.allowedAudiences = List.of();
        this.issuerUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;
        private String issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        public Builder issuerUri(String issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }        public OidcResponse build() {
            return new OidcResponse(allowedAudiences, issuerUri);
        }
    }
}
