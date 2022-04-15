// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration;

import io.pulumi.azurenative.certificateregistration.enums.CertificateProductType;
import io.pulumi.azurenative.certificateregistration.inputs.AppServiceCertificateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppServiceCertificateOrderArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServiceCertificateOrderArgs Empty = new AppServiceCertificateOrderArgs();

    /**
     * <code>true</code> if the certificate should be automatically renewed when it expires; otherwise, <code>false</code>.
     * 
     */
    @Import(name="autoRenew")
      private final @Nullable Output<Boolean> autoRenew;

    public Output<Boolean> autoRenew() {
        return this.autoRenew == null ? Codegen.empty() : this.autoRenew;
    }

    /**
     * Name of the certificate order.
     * 
     */
    @Import(name="certificateOrderName")
      private final @Nullable Output<String> certificateOrderName;

    public Output<String> certificateOrderName() {
        return this.certificateOrderName == null ? Codegen.empty() : this.certificateOrderName;
    }

    /**
     * State of the Key Vault secret.
     * 
     */
    @Import(name="certificates")
      private final @Nullable Output<Map<String,AppServiceCertificateArgs>> certificates;

    public Output<Map<String,AppServiceCertificateArgs>> certificates() {
        return this.certificates == null ? Codegen.empty() : this.certificates;
    }

    /**
     * Last CSR that was created for this order.
     * 
     */
    @Import(name="csr")
      private final @Nullable Output<String> csr;

    public Output<String> csr() {
        return this.csr == null ? Codegen.empty() : this.csr;
    }

    /**
     * Certificate distinguished name.
     * 
     */
    @Import(name="distinguishedName")
      private final @Nullable Output<String> distinguishedName;

    public Output<String> distinguishedName() {
        return this.distinguishedName == null ? Codegen.empty() : this.distinguishedName;
    }

    /**
     * Certificate key size.
     * 
     */
    @Import(name="keySize")
      private final @Nullable Output<Integer> keySize;

    public Output<Integer> keySize() {
        return this.keySize == null ? Codegen.empty() : this.keySize;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Certificate product type.
     * 
     */
    @Import(name="productType", required=true)
      private final Output<CertificateProductType> productType;

    public Output<CertificateProductType> productType() {
        return this.productType;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Duration in years (must be between 1 and 3).
     * 
     */
    @Import(name="validityInYears")
      private final @Nullable Output<Integer> validityInYears;

    public Output<Integer> validityInYears() {
        return this.validityInYears == null ? Codegen.empty() : this.validityInYears;
    }

    public AppServiceCertificateOrderArgs(
        @Nullable Output<Boolean> autoRenew,
        @Nullable Output<String> certificateOrderName,
        @Nullable Output<Map<String,AppServiceCertificateArgs>> certificates,
        @Nullable Output<String> csr,
        @Nullable Output<String> distinguishedName,
        @Nullable Output<Integer> keySize,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        Output<CertificateProductType> productType,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> validityInYears) {
        this.autoRenew = autoRenew == null ? Codegen.ofNullable(true) : autoRenew;
        this.certificateOrderName = certificateOrderName;
        this.certificates = certificates;
        this.csr = csr;
        this.distinguishedName = distinguishedName;
        this.keySize = keySize == null ? Codegen.ofNullable(2048) : keySize;
        this.kind = kind;
        this.location = location;
        this.productType = Objects.requireNonNull(productType, "expected parameter 'productType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.validityInYears = validityInYears == null ? Codegen.ofNullable(1) : validityInYears;
    }

    private AppServiceCertificateOrderArgs() {
        this.autoRenew = Codegen.empty();
        this.certificateOrderName = Codegen.empty();
        this.certificates = Codegen.empty();
        this.csr = Codegen.empty();
        this.distinguishedName = Codegen.empty();
        this.keySize = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.productType = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.validityInYears = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceCertificateOrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoRenew;
        private @Nullable Output<String> certificateOrderName;
        private @Nullable Output<Map<String,AppServiceCertificateArgs>> certificates;
        private @Nullable Output<String> csr;
        private @Nullable Output<String> distinguishedName;
        private @Nullable Output<Integer> keySize;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private Output<CertificateProductType> productType;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> validityInYears;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceCertificateOrderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.certificateOrderName = defaults.certificateOrderName;
    	      this.certificates = defaults.certificates;
    	      this.csr = defaults.csr;
    	      this.distinguishedName = defaults.distinguishedName;
    	      this.keySize = defaults.keySize;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.productType = defaults.productType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.validityInYears = defaults.validityInYears;
        }

        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Builder autoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = Codegen.ofNullable(autoRenew);
            return this;
        }
        public Builder certificateOrderName(@Nullable Output<String> certificateOrderName) {
            this.certificateOrderName = certificateOrderName;
            return this;
        }
        public Builder certificateOrderName(@Nullable String certificateOrderName) {
            this.certificateOrderName = Codegen.ofNullable(certificateOrderName);
            return this;
        }
        public Builder certificates(@Nullable Output<Map<String,AppServiceCertificateArgs>> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(@Nullable Map<String,AppServiceCertificateArgs> certificates) {
            this.certificates = Codegen.ofNullable(certificates);
            return this;
        }
        public Builder csr(@Nullable Output<String> csr) {
            this.csr = csr;
            return this;
        }
        public Builder csr(@Nullable String csr) {
            this.csr = Codegen.ofNullable(csr);
            return this;
        }
        public Builder distinguishedName(@Nullable Output<String> distinguishedName) {
            this.distinguishedName = distinguishedName;
            return this;
        }
        public Builder distinguishedName(@Nullable String distinguishedName) {
            this.distinguishedName = Codegen.ofNullable(distinguishedName);
            return this;
        }
        public Builder keySize(@Nullable Output<Integer> keySize) {
            this.keySize = keySize;
            return this;
        }
        public Builder keySize(@Nullable Integer keySize) {
            this.keySize = Codegen.ofNullable(keySize);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder productType(Output<CertificateProductType> productType) {
            this.productType = Objects.requireNonNull(productType);
            return this;
        }
        public Builder productType(CertificateProductType productType) {
            this.productType = Output.of(Objects.requireNonNull(productType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public Builder validityInYears(@Nullable Output<Integer> validityInYears) {
            this.validityInYears = validityInYears;
            return this;
        }
        public Builder validityInYears(@Nullable Integer validityInYears) {
            this.validityInYears = Codegen.ofNullable(validityInYears);
            return this;
        }        public AppServiceCertificateOrderArgs build() {
            return new AppServiceCertificateOrderArgs(autoRenew, certificateOrderName, certificates, csr, distinguishedName, keySize, kind, location, productType, resourceGroupName, tags, validityInYears);
        }
    }
}
