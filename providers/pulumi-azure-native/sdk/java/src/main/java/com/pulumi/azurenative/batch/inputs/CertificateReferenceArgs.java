// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.CertificateStoreLocation;
import com.pulumi.azurenative.batch.enums.CertificateVisibility;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateReferenceArgs Empty = new CertificateReferenceArgs();

    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * The default value is currentUser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of &#39;remoteUser&#39;, a &#39;certs&#39; directory is created in the user&#39;s home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    @Import(name="storeLocation")
      private final @Nullable Output<CertificateStoreLocation> storeLocation;

    public Output<CertificateStoreLocation> storeLocation() {
        return this.storeLocation == null ? Codegen.empty() : this.storeLocation;
    }

    /**
     * This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     * 
     */
    @Import(name="storeName")
      private final @Nullable Output<String> storeName;

    public Output<String> storeName() {
        return this.storeName == null ? Codegen.empty() : this.storeName;
    }

    @Import(name="visibility")
      private final @Nullable Output<List<CertificateVisibility>> visibility;

    public Output<List<CertificateVisibility>> visibility() {
        return this.visibility == null ? Codegen.empty() : this.visibility;
    }

    public CertificateReferenceArgs(
        Output<String> id,
        @Nullable Output<CertificateStoreLocation> storeLocation,
        @Nullable Output<String> storeName,
        @Nullable Output<List<CertificateVisibility>> visibility) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.visibility = visibility;
    }

    private CertificateReferenceArgs() {
        this.id = Codegen.empty();
        this.storeLocation = Codegen.empty();
        this.storeName = Codegen.empty();
        this.visibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<CertificateStoreLocation> storeLocation;
        private @Nullable Output<String> storeName;
        private @Nullable Output<List<CertificateVisibility>> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibility = defaults.visibility;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder storeLocation(@Nullable Output<CertificateStoreLocation> storeLocation) {
            this.storeLocation = storeLocation;
            return this;
        }
        public Builder storeLocation(@Nullable CertificateStoreLocation storeLocation) {
            this.storeLocation = Codegen.ofNullable(storeLocation);
            return this;
        }
        public Builder storeName(@Nullable Output<String> storeName) {
            this.storeName = storeName;
            return this;
        }
        public Builder storeName(@Nullable String storeName) {
            this.storeName = Codegen.ofNullable(storeName);
            return this;
        }
        public Builder visibility(@Nullable Output<List<CertificateVisibility>> visibility) {
            this.visibility = visibility;
            return this;
        }
        public Builder visibility(@Nullable List<CertificateVisibility> visibility) {
            this.visibility = Codegen.ofNullable(visibility);
            return this;
        }
        public Builder visibility(CertificateVisibility... visibility) {
            return visibility(List.of(visibility));
        }        public CertificateReferenceArgs build() {
            return new CertificateReferenceArgs(id, storeLocation, storeName, visibility);
        }
    }
}
