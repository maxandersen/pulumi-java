// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigSpCertificateGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundSamlConfigSpConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigSpConfigGetArgs Empty = new InboundSamlConfigSpConfigGetArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @Import(name="callbackUri")
      private final @Nullable Output<String> callbackUri;

    public Output<String> callbackUri() {
        return this.callbackUri == null ? Codegen.empty() : this.callbackUri;
    }

    /**
     * - 
     * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @Import(name="spCertificates")
      private final @Nullable Output<List<InboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates;

    public Output<List<InboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates() {
        return this.spCertificates == null ? Codegen.empty() : this.spCertificates;
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @Import(name="spEntityId")
      private final @Nullable Output<String> spEntityId;

    public Output<String> spEntityId() {
        return this.spEntityId == null ? Codegen.empty() : this.spEntityId;
    }

    public InboundSamlConfigSpConfigGetArgs(
        @Nullable Output<String> callbackUri,
        @Nullable Output<List<InboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates,
        @Nullable Output<String> spEntityId) {
        this.callbackUri = callbackUri;
        this.spCertificates = spCertificates;
        this.spEntityId = spEntityId;
    }

    private InboundSamlConfigSpConfigGetArgs() {
        this.callbackUri = Codegen.empty();
        this.spCertificates = Codegen.empty();
        this.spEntityId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> callbackUri;
        private @Nullable Output<List<InboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates;
        private @Nullable Output<String> spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder callbackUri(@Nullable Output<String> callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }
        public Builder callbackUri(@Nullable String callbackUri) {
            this.callbackUri = Codegen.ofNullable(callbackUri);
            return this;
        }
        public Builder spCertificates(@Nullable Output<List<InboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }
        public Builder spCertificates(@Nullable List<InboundSamlConfigSpConfigSpCertificateGetArgs> spCertificates) {
            this.spCertificates = Codegen.ofNullable(spCertificates);
            return this;
        }
        public Builder spCertificates(InboundSamlConfigSpConfigSpCertificateGetArgs... spCertificates) {
            return spCertificates(List.of(spCertificates));
        }
        public Builder spEntityId(@Nullable Output<String> spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }
        public Builder spEntityId(@Nullable String spEntityId) {
            this.spEntityId = Codegen.ofNullable(spEntityId);
            return this;
        }        public InboundSamlConfigSpConfigGetArgs build() {
            return new InboundSamlConfigSpConfigGetArgs(callbackUri, spCertificates, spEntityId);
        }
    }
}
