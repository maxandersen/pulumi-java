// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect). This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
 * 
 */
public final class OidcTokenResponse extends io.pulumi.resources.InvokeArgs {

    public static final OidcTokenResponse Empty = new OidcTokenResponse();

    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    @Import(name="audience", required=true)
      private final String audience;

    public String audience() {
        return this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
      private final String serviceAccountEmail;

    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public OidcTokenResponse(
        String audience,
        String serviceAccountEmail) {
        this.audience = Objects.requireNonNull(audience, "expected parameter 'audience' to be non-null");
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private OidcTokenResponse() {
        this.audience = null;
        this.serviceAccountEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }        public OidcTokenResponse build() {
            return new OidcTokenResponse(audience, serviceAccountEmail);
        }
    }
}
