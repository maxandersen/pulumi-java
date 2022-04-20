// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolState extends com.pulumi.resources.ResourceArgs {

    public static final IdentityPoolState Empty = new IdentityPoolState();

    /**
     * Enables or disables the classic / basic authentication flow. Default is `false`.
     * 
     */
    @Import(name="allowClassicFlow")
      private final @Nullable Output<Boolean> allowClassicFlow;

    public Output<Boolean> allowClassicFlow() {
        return this.allowClassicFlow == null ? Codegen.empty() : this.allowClassicFlow;
    }

    /**
     * Whether the identity pool supports unauthenticated logins or not.
     * 
     */
    @Import(name="allowUnauthenticatedIdentities")
      private final @Nullable Output<Boolean> allowUnauthenticatedIdentities;

    public Output<Boolean> allowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities == null ? Codegen.empty() : this.allowUnauthenticatedIdentities;
    }

    /**
     * The ARN of the identity pool.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * An array of Amazon Cognito Identity user pools and their client IDs.
     * 
     */
    @Import(name="cognitoIdentityProviders")
      private final @Nullable Output<List<IdentityPoolCognitoIdentityProviderGetArgs>> cognitoIdentityProviders;

    public Output<List<IdentityPoolCognitoIdentityProviderGetArgs>> cognitoIdentityProviders() {
        return this.cognitoIdentityProviders == null ? Codegen.empty() : this.cognitoIdentityProviders;
    }

    /**
     * The &#34;domain&#34; by which Cognito will refer to your users. This name acts as a placeholder that allows your
     * backend and the Cognito service to communicate about the developer provider.
     * 
     */
    @Import(name="developerProviderName")
      private final @Nullable Output<String> developerProviderName;

    public Output<String> developerProviderName() {
        return this.developerProviderName == null ? Codegen.empty() : this.developerProviderName;
    }

    /**
     * The Cognito Identity Pool name.
     * 
     */
    @Import(name="identityPoolName")
      private final @Nullable Output<String> identityPoolName;

    public Output<String> identityPoolName() {
        return this.identityPoolName == null ? Codegen.empty() : this.identityPoolName;
    }

    /**
     * Set of OpendID Connect provider ARNs.
     * 
     */
    @Import(name="openidConnectProviderArns")
      private final @Nullable Output<List<String>> openidConnectProviderArns;

    public Output<List<String>> openidConnectProviderArns() {
        return this.openidConnectProviderArns == null ? Codegen.empty() : this.openidConnectProviderArns;
    }

    /**
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
     * 
     */
    @Import(name="samlProviderArns")
      private final @Nullable Output<List<String>> samlProviderArns;

    public Output<List<String>> samlProviderArns() {
        return this.samlProviderArns == null ? Codegen.empty() : this.samlProviderArns;
    }

    /**
     * Key-Value pairs mapping provider names to provider app IDs.
     * 
     */
    @Import(name="supportedLoginProviders")
      private final @Nullable Output<Map<String,String>> supportedLoginProviders;

    public Output<Map<String,String>> supportedLoginProviders() {
        return this.supportedLoginProviders == null ? Codegen.empty() : this.supportedLoginProviders;
    }

    /**
     * A map of tags to assign to the Identity Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public IdentityPoolState(
        @Nullable Output<Boolean> allowClassicFlow,
        @Nullable Output<Boolean> allowUnauthenticatedIdentities,
        @Nullable Output<String> arn,
        @Nullable Output<List<IdentityPoolCognitoIdentityProviderGetArgs>> cognitoIdentityProviders,
        @Nullable Output<String> developerProviderName,
        @Nullable Output<String> identityPoolName,
        @Nullable Output<List<String>> openidConnectProviderArns,
        @Nullable Output<List<String>> samlProviderArns,
        @Nullable Output<Map<String,String>> supportedLoginProviders,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.allowClassicFlow = allowClassicFlow;
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        this.arn = arn;
        this.cognitoIdentityProviders = cognitoIdentityProviders;
        this.developerProviderName = developerProviderName;
        this.identityPoolName = identityPoolName;
        this.openidConnectProviderArns = openidConnectProviderArns;
        this.samlProviderArns = samlProviderArns;
        this.supportedLoginProviders = supportedLoginProviders;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private IdentityPoolState() {
        this.allowClassicFlow = Codegen.empty();
        this.allowUnauthenticatedIdentities = Codegen.empty();
        this.arn = Codegen.empty();
        this.cognitoIdentityProviders = Codegen.empty();
        this.developerProviderName = Codegen.empty();
        this.identityPoolName = Codegen.empty();
        this.openidConnectProviderArns = Codegen.empty();
        this.samlProviderArns = Codegen.empty();
        this.supportedLoginProviders = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowClassicFlow;
        private @Nullable Output<Boolean> allowUnauthenticatedIdentities;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<IdentityPoolCognitoIdentityProviderGetArgs>> cognitoIdentityProviders;
        private @Nullable Output<String> developerProviderName;
        private @Nullable Output<String> identityPoolName;
        private @Nullable Output<List<String>> openidConnectProviderArns;
        private @Nullable Output<List<String>> samlProviderArns;
        private @Nullable Output<Map<String,String>> supportedLoginProviders;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicFlow = defaults.allowClassicFlow;
    	      this.allowUnauthenticatedIdentities = defaults.allowUnauthenticatedIdentities;
    	      this.arn = defaults.arn;
    	      this.cognitoIdentityProviders = defaults.cognitoIdentityProviders;
    	      this.developerProviderName = defaults.developerProviderName;
    	      this.identityPoolName = defaults.identityPoolName;
    	      this.openidConnectProviderArns = defaults.openidConnectProviderArns;
    	      this.samlProviderArns = defaults.samlProviderArns;
    	      this.supportedLoginProviders = defaults.supportedLoginProviders;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder allowClassicFlow(@Nullable Output<Boolean> allowClassicFlow) {
            this.allowClassicFlow = allowClassicFlow;
            return this;
        }
        public Builder allowClassicFlow(@Nullable Boolean allowClassicFlow) {
            this.allowClassicFlow = Codegen.ofNullable(allowClassicFlow);
            return this;
        }
        public Builder allowUnauthenticatedIdentities(@Nullable Output<Boolean> allowUnauthenticatedIdentities) {
            this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
            return this;
        }
        public Builder allowUnauthenticatedIdentities(@Nullable Boolean allowUnauthenticatedIdentities) {
            this.allowUnauthenticatedIdentities = Codegen.ofNullable(allowUnauthenticatedIdentities);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder cognitoIdentityProviders(@Nullable Output<List<IdentityPoolCognitoIdentityProviderGetArgs>> cognitoIdentityProviders) {
            this.cognitoIdentityProviders = cognitoIdentityProviders;
            return this;
        }
        public Builder cognitoIdentityProviders(@Nullable List<IdentityPoolCognitoIdentityProviderGetArgs> cognitoIdentityProviders) {
            this.cognitoIdentityProviders = Codegen.ofNullable(cognitoIdentityProviders);
            return this;
        }
        public Builder cognitoIdentityProviders(IdentityPoolCognitoIdentityProviderGetArgs... cognitoIdentityProviders) {
            return cognitoIdentityProviders(List.of(cognitoIdentityProviders));
        }
        public Builder developerProviderName(@Nullable Output<String> developerProviderName) {
            this.developerProviderName = developerProviderName;
            return this;
        }
        public Builder developerProviderName(@Nullable String developerProviderName) {
            this.developerProviderName = Codegen.ofNullable(developerProviderName);
            return this;
        }
        public Builder identityPoolName(@Nullable Output<String> identityPoolName) {
            this.identityPoolName = identityPoolName;
            return this;
        }
        public Builder identityPoolName(@Nullable String identityPoolName) {
            this.identityPoolName = Codegen.ofNullable(identityPoolName);
            return this;
        }
        public Builder openidConnectProviderArns(@Nullable Output<List<String>> openidConnectProviderArns) {
            this.openidConnectProviderArns = openidConnectProviderArns;
            return this;
        }
        public Builder openidConnectProviderArns(@Nullable List<String> openidConnectProviderArns) {
            this.openidConnectProviderArns = Codegen.ofNullable(openidConnectProviderArns);
            return this;
        }
        public Builder openidConnectProviderArns(String... openidConnectProviderArns) {
            return openidConnectProviderArns(List.of(openidConnectProviderArns));
        }
        public Builder samlProviderArns(@Nullable Output<List<String>> samlProviderArns) {
            this.samlProviderArns = samlProviderArns;
            return this;
        }
        public Builder samlProviderArns(@Nullable List<String> samlProviderArns) {
            this.samlProviderArns = Codegen.ofNullable(samlProviderArns);
            return this;
        }
        public Builder samlProviderArns(String... samlProviderArns) {
            return samlProviderArns(List.of(samlProviderArns));
        }
        public Builder supportedLoginProviders(@Nullable Output<Map<String,String>> supportedLoginProviders) {
            this.supportedLoginProviders = supportedLoginProviders;
            return this;
        }
        public Builder supportedLoginProviders(@Nullable Map<String,String> supportedLoginProviders) {
            this.supportedLoginProviders = Codegen.ofNullable(supportedLoginProviders);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public IdentityPoolState build() {
            return new IdentityPoolState(allowClassicFlow, allowUnauthenticatedIdentities, arn, cognitoIdentityProviders, developerProviderName, identityPoolName, openidConnectProviderArns, samlProviderArns, supportedLoginProviders, tags, tagsAll);
        }
    }
}
