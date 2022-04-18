// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionViewerCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionViewerCertificateArgs Empty = new DistributionViewerCertificateArgs();

    @Import(name="acmCertificateArn")
      private final @Nullable Output<String> acmCertificateArn;

    public Output<String> acmCertificateArn() {
        return this.acmCertificateArn == null ? Codegen.empty() : this.acmCertificateArn;
    }

    @Import(name="cloudFrontDefaultCertificate")
      private final @Nullable Output<Boolean> cloudFrontDefaultCertificate;

    public Output<Boolean> cloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate == null ? Codegen.empty() : this.cloudFrontDefaultCertificate;
    }

    @Import(name="iamCertificateId")
      private final @Nullable Output<String> iamCertificateId;

    public Output<String> iamCertificateId() {
        return this.iamCertificateId == null ? Codegen.empty() : this.iamCertificateId;
    }

    @Import(name="minimumProtocolVersion")
      private final @Nullable Output<String> minimumProtocolVersion;

    public Output<String> minimumProtocolVersion() {
        return this.minimumProtocolVersion == null ? Codegen.empty() : this.minimumProtocolVersion;
    }

    @Import(name="sslSupportMethod")
      private final @Nullable Output<String> sslSupportMethod;

    public Output<String> sslSupportMethod() {
        return this.sslSupportMethod == null ? Codegen.empty() : this.sslSupportMethod;
    }

    public DistributionViewerCertificateArgs(
        @Nullable Output<String> acmCertificateArn,
        @Nullable Output<Boolean> cloudFrontDefaultCertificate,
        @Nullable Output<String> iamCertificateId,
        @Nullable Output<String> minimumProtocolVersion,
        @Nullable Output<String> sslSupportMethod) {
        this.acmCertificateArn = acmCertificateArn;
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        this.iamCertificateId = iamCertificateId;
        this.minimumProtocolVersion = minimumProtocolVersion;
        this.sslSupportMethod = sslSupportMethod;
    }

    private DistributionViewerCertificateArgs() {
        this.acmCertificateArn = Codegen.empty();
        this.cloudFrontDefaultCertificate = Codegen.empty();
        this.iamCertificateId = Codegen.empty();
        this.minimumProtocolVersion = Codegen.empty();
        this.sslSupportMethod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionViewerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acmCertificateArn;
        private @Nullable Output<Boolean> cloudFrontDefaultCertificate;
        private @Nullable Output<String> iamCertificateId;
        private @Nullable Output<String> minimumProtocolVersion;
        private @Nullable Output<String> sslSupportMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionViewerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acmCertificateArn = defaults.acmCertificateArn;
    	      this.cloudFrontDefaultCertificate = defaults.cloudFrontDefaultCertificate;
    	      this.iamCertificateId = defaults.iamCertificateId;
    	      this.minimumProtocolVersion = defaults.minimumProtocolVersion;
    	      this.sslSupportMethod = defaults.sslSupportMethod;
        }

        public Builder acmCertificateArn(@Nullable Output<String> acmCertificateArn) {
            this.acmCertificateArn = acmCertificateArn;
            return this;
        }
        public Builder acmCertificateArn(@Nullable String acmCertificateArn) {
            this.acmCertificateArn = Codegen.ofNullable(acmCertificateArn);
            return this;
        }
        public Builder cloudFrontDefaultCertificate(@Nullable Output<Boolean> cloudFrontDefaultCertificate) {
            this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
            return this;
        }
        public Builder cloudFrontDefaultCertificate(@Nullable Boolean cloudFrontDefaultCertificate) {
            this.cloudFrontDefaultCertificate = Codegen.ofNullable(cloudFrontDefaultCertificate);
            return this;
        }
        public Builder iamCertificateId(@Nullable Output<String> iamCertificateId) {
            this.iamCertificateId = iamCertificateId;
            return this;
        }
        public Builder iamCertificateId(@Nullable String iamCertificateId) {
            this.iamCertificateId = Codegen.ofNullable(iamCertificateId);
            return this;
        }
        public Builder minimumProtocolVersion(@Nullable Output<String> minimumProtocolVersion) {
            this.minimumProtocolVersion = minimumProtocolVersion;
            return this;
        }
        public Builder minimumProtocolVersion(@Nullable String minimumProtocolVersion) {
            this.minimumProtocolVersion = Codegen.ofNullable(minimumProtocolVersion);
            return this;
        }
        public Builder sslSupportMethod(@Nullable Output<String> sslSupportMethod) {
            this.sslSupportMethod = sslSupportMethod;
            return this;
        }
        public Builder sslSupportMethod(@Nullable String sslSupportMethod) {
            this.sslSupportMethod = Codegen.ofNullable(sslSupportMethod);
            return this;
        }        public DistributionViewerCertificateArgs build() {
            return new DistributionViewerCertificateArgs(acmCertificateArn, cloudFrontDefaultCertificate, iamCertificateId, minimumProtocolVersion, sslSupportMethod);
        }
    }
}
