// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationTlsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTlsConfigArgs Empty = new IntegrationTlsConfigArgs();

    /**
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * 
     */
    @Import(name="serverNameToVerify")
      private final @Nullable Output<String> serverNameToVerify;

    public Output<String> serverNameToVerify() {
        return this.serverNameToVerify == null ? Codegen.empty() : this.serverNameToVerify;
    }

    public IntegrationTlsConfigArgs(@Nullable Output<String> serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
    }

    private IntegrationTlsConfigArgs() {
        this.serverNameToVerify = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTlsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> serverNameToVerify;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTlsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverNameToVerify = defaults.serverNameToVerify;
        }

        public Builder serverNameToVerify(@Nullable Output<String> serverNameToVerify) {
            this.serverNameToVerify = serverNameToVerify;
            return this;
        }
        public Builder serverNameToVerify(@Nullable String serverNameToVerify) {
            this.serverNameToVerify = Codegen.ofNullable(serverNameToVerify);
            return this;
        }        public IntegrationTlsConfigArgs build() {
            return new IntegrationTlsConfigArgs(serverNameToVerify);
        }
    }
}
