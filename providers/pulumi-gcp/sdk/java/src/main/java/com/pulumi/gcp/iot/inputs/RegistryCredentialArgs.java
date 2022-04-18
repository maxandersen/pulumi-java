// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class RegistryCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryCredentialArgs Empty = new RegistryCredentialArgs();

    /**
     * A public key certificate format and data.
     * 
     */
    @Import(name="publicKeyCertificate", required=true)
      private final Output<Map<String,Object>> publicKeyCertificate;

    public Output<Map<String,Object>> publicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public RegistryCredentialArgs(Output<Map<String,Object>> publicKeyCertificate) {
        this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate, "expected parameter 'publicKeyCertificate' to be non-null");
    }

    private RegistryCredentialArgs() {
        this.publicKeyCertificate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,Object>> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(Output<Map<String,Object>> publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }
        public Builder publicKeyCertificate(Map<String,Object> publicKeyCertificate) {
            this.publicKeyCertificate = Output.of(Objects.requireNonNull(publicKeyCertificate));
            return this;
        }        public RegistryCredentialArgs build() {
            return new RegistryCredentialArgs(publicKeyCertificate);
        }
    }
}
