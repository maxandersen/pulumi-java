// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerTrustCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerTrustCertificateArgs Empty = new ServerTrustCertificateArgs();

    /**
     * Name of of the certificate to upload.
     * 
     */
    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> certificateName() {
        return this.certificateName == null ? Codegen.empty() : this.certificateName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
      private final Output<String> managedInstanceName;

    public Output<String> managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The certificate public blob
     * 
     */
    @Import(name="publicBlob")
      private final @Nullable Output<String> publicBlob;

    public Output<String> publicBlob() {
        return this.publicBlob == null ? Codegen.empty() : this.publicBlob;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public ServerTrustCertificateArgs(
        @Nullable Output<String> certificateName,
        Output<String> managedInstanceName,
        @Nullable Output<String> publicBlob,
        Output<String> resourceGroupName) {
        this.certificateName = certificateName;
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.publicBlob = publicBlob;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ServerTrustCertificateArgs() {
        this.certificateName = Codegen.empty();
        this.managedInstanceName = Codegen.empty();
        this.publicBlob = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTrustCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateName;
        private Output<String> managedInstanceName;
        private @Nullable Output<String> publicBlob;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTrustCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.publicBlob = defaults.publicBlob;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Codegen.ofNullable(certificateName);
            return this;
        }
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }
        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Output.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }
        public Builder publicBlob(@Nullable Output<String> publicBlob) {
            this.publicBlob = publicBlob;
            return this;
        }
        public Builder publicBlob(@Nullable String publicBlob) {
            this.publicBlob = Codegen.ofNullable(publicBlob);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ServerTrustCertificateArgs build() {
            return new ServerTrustCertificateArgs(certificateName, managedInstanceName, publicBlob, resourceGroupName);
        }
    }
}
