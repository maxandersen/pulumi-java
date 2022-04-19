// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationFederatedIdentityCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationFederatedIdentityCredentialState Empty = new ApplicationFederatedIdentityCredentialState();

    /**
     * The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="applicationObjectId")
      private final @Nullable Output<String> applicationObjectId;

    public Output<String> applicationObjectId() {
        return this.applicationObjectId == null ? Codegen.empty() : this.applicationObjectId;
    }

    /**
     * List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
     * 
     */
    @Import(name="audiences")
      private final @Nullable Output<List<String>> audiences;

    public Output<List<String>> audiences() {
        return this.audiences == null ? Codegen.empty() : this.audiences;
    }

    /**
     * A UUID used to uniquely identify this federated identity credential.
     * 
     */
    @Import(name="credentialId")
      private final @Nullable Output<String> credentialId;

    public Output<String> credentialId() {
        return this.credentialId == null ? Codegen.empty() : this.credentialId;
    }

    /**
     * A description for the federated identity credential.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A unique display name for the federated identity credential. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer == null ? Codegen.empty() : this.issuer;
    }

    /**
     * The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<String> subject;

    public Output<String> subject() {
        return this.subject == null ? Codegen.empty() : this.subject;
    }

    public ApplicationFederatedIdentityCredentialState(
        @Nullable Output<String> applicationObjectId,
        @Nullable Output<List<String>> audiences,
        @Nullable Output<String> credentialId,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> issuer,
        @Nullable Output<String> subject) {
        this.applicationObjectId = applicationObjectId;
        this.audiences = audiences;
        this.credentialId = credentialId;
        this.description = description;
        this.displayName = displayName;
        this.issuer = issuer;
        this.subject = subject;
    }

    private ApplicationFederatedIdentityCredentialState() {
        this.applicationObjectId = Codegen.empty();
        this.audiences = Codegen.empty();
        this.credentialId = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.issuer = Codegen.empty();
        this.subject = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationFederatedIdentityCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationObjectId;
        private @Nullable Output<List<String>> audiences;
        private @Nullable Output<String> credentialId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> issuer;
        private @Nullable Output<String> subject;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationFederatedIdentityCredentialState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationObjectId = defaults.applicationObjectId;
    	      this.audiences = defaults.audiences;
    	      this.credentialId = defaults.credentialId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.issuer = defaults.issuer;
    	      this.subject = defaults.subject;
        }

        public Builder applicationObjectId(@Nullable Output<String> applicationObjectId) {
            this.applicationObjectId = applicationObjectId;
            return this;
        }
        public Builder applicationObjectId(@Nullable String applicationObjectId) {
            this.applicationObjectId = Codegen.ofNullable(applicationObjectId);
            return this;
        }
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = Codegen.ofNullable(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        public Builder credentialId(@Nullable Output<String> credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public Builder credentialId(@Nullable String credentialId) {
            this.credentialId = Codegen.ofNullable(credentialId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = Codegen.ofNullable(issuer);
            return this;
        }
        public Builder subject(@Nullable Output<String> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = Codegen.ofNullable(subject);
            return this;
        }        public ApplicationFederatedIdentityCredentialState build() {
            return new ApplicationFederatedIdentityCredentialState(applicationObjectId, audiences, credentialId, description, displayName, issuer, subject);
        }
    }
}
