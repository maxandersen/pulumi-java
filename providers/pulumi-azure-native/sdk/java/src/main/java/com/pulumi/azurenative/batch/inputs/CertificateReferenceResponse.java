// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateReferenceResponse Empty = new CertificateReferenceResponse();

    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The default value is currentUser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of &#39;remoteUser&#39;, a &#39;certs&#39; directory is created in the user&#39;s home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    @Import(name="storeLocation")
      private final @Nullable String storeLocation;

    public Optional<String> storeLocation() {
        return this.storeLocation == null ? Optional.empty() : Optional.ofNullable(this.storeLocation);
    }

    /**
     * This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     * 
     */
    @Import(name="storeName")
      private final @Nullable String storeName;

    public Optional<String> storeName() {
        return this.storeName == null ? Optional.empty() : Optional.ofNullable(this.storeName);
    }

    @Import(name="visibility")
      private final @Nullable List<String> visibility;

    public List<String> visibility() {
        return this.visibility == null ? List.of() : this.visibility;
    }

    public CertificateReferenceResponse(
        String id,
        @Nullable String storeLocation,
        @Nullable String storeName,
        @Nullable List<String> visibility) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.visibility = visibility;
    }

    private CertificateReferenceResponse() {
        this.id = null;
        this.storeLocation = null;
        this.storeName = null;
        this.visibility = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String storeLocation;
        private @Nullable String storeName;
        private @Nullable List<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibility = defaults.visibility;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder storeLocation(@Nullable String storeLocation) {
            this.storeLocation = storeLocation;
            return this;
        }
        public Builder storeName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }
        public Builder visibility(@Nullable List<String> visibility) {
            this.visibility = visibility;
            return this;
        }
        public Builder visibility(String... visibility) {
            return visibility(List.of(visibility));
        }        public CertificateReferenceResponse build() {
            return new CertificateReferenceResponse(id, storeLocation, storeName, visibility);
        }
    }
}
