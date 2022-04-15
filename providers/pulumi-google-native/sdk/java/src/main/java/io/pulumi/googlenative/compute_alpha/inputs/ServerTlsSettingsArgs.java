// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.ServerTlsSettingsTlsMode;
import io.pulumi.googlenative.compute_alpha.inputs.TlsContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The TLS settings for the server.
 * 
 */
public final class ServerTlsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerTlsSettingsArgs Empty = new ServerTlsSettingsArgs();

    /**
     * Configures the mechanism to obtain security certificates and identity information.
     * 
     */
    @Import(name="proxyTlsContext")
      private final @Nullable Output<TlsContextArgs> proxyTlsContext;

    public Output<TlsContextArgs> proxyTlsContext() {
        return this.proxyTlsContext == null ? Codegen.empty() : this.proxyTlsContext;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     * 
     */
    @Import(name="subjectAltNames")
      private final @Nullable Output<List<String>> subjectAltNames;

    public Output<List<String>> subjectAltNames() {
        return this.subjectAltNames == null ? Codegen.empty() : this.subjectAltNames;
    }

    /**
     * Indicates whether connections should be secured using TLS. The value of this field determines how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    @Import(name="tlsMode")
      private final @Nullable Output<ServerTlsSettingsTlsMode> tlsMode;

    public Output<ServerTlsSettingsTlsMode> tlsMode() {
        return this.tlsMode == null ? Codegen.empty() : this.tlsMode;
    }

    public ServerTlsSettingsArgs(
        @Nullable Output<TlsContextArgs> proxyTlsContext,
        @Nullable Output<List<String>> subjectAltNames,
        @Nullable Output<ServerTlsSettingsTlsMode> tlsMode) {
        this.proxyTlsContext = proxyTlsContext;
        this.subjectAltNames = subjectAltNames;
        this.tlsMode = tlsMode;
    }

    private ServerTlsSettingsArgs() {
        this.proxyTlsContext = Codegen.empty();
        this.subjectAltNames = Codegen.empty();
        this.tlsMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TlsContextArgs> proxyTlsContext;
        private @Nullable Output<List<String>> subjectAltNames;
        private @Nullable Output<ServerTlsSettingsTlsMode> tlsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTlsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyTlsContext = defaults.proxyTlsContext;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.tlsMode = defaults.tlsMode;
        }

        public Builder proxyTlsContext(@Nullable Output<TlsContextArgs> proxyTlsContext) {
            this.proxyTlsContext = proxyTlsContext;
            return this;
        }
        public Builder proxyTlsContext(@Nullable TlsContextArgs proxyTlsContext) {
            this.proxyTlsContext = Codegen.ofNullable(proxyTlsContext);
            return this;
        }
        public Builder subjectAltNames(@Nullable Output<List<String>> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }
        public Builder subjectAltNames(@Nullable List<String> subjectAltNames) {
            this.subjectAltNames = Codegen.ofNullable(subjectAltNames);
            return this;
        }
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }
        public Builder tlsMode(@Nullable Output<ServerTlsSettingsTlsMode> tlsMode) {
            this.tlsMode = tlsMode;
            return this;
        }
        public Builder tlsMode(@Nullable ServerTlsSettingsTlsMode tlsMode) {
            this.tlsMode = Codegen.ofNullable(tlsMode);
            return this;
        }        public ServerTlsSettingsArgs build() {
            return new ServerTlsSettingsArgs(proxyTlsContext, subjectAltNames, tlsMode);
        }
    }
}
