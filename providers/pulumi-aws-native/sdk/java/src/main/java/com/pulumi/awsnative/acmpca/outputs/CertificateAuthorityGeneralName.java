// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.outputs;

import com.pulumi.awsnative.acmpca.outputs.CertificateAuthorityEdiPartyName;
import com.pulumi.awsnative.acmpca.outputs.CertificateAuthorityOtherName;
import com.pulumi.awsnative.acmpca.outputs.CertificateAuthoritySubject;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityGeneralName {
    private final @Nullable CertificateAuthoritySubject directoryName;
    private final @Nullable String dnsName;
    private final @Nullable CertificateAuthorityEdiPartyName ediPartyName;
    private final @Nullable String ipAddress;
    private final @Nullable CertificateAuthorityOtherName otherName;
    private final @Nullable String registeredId;
    private final @Nullable String rfc822Name;
    private final @Nullable String uniformResourceIdentifier;

    @CustomType.Constructor
    private CertificateAuthorityGeneralName(
        @CustomType.Parameter("directoryName") @Nullable CertificateAuthoritySubject directoryName,
        @CustomType.Parameter("dnsName") @Nullable String dnsName,
        @CustomType.Parameter("ediPartyName") @Nullable CertificateAuthorityEdiPartyName ediPartyName,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("otherName") @Nullable CertificateAuthorityOtherName otherName,
        @CustomType.Parameter("registeredId") @Nullable String registeredId,
        @CustomType.Parameter("rfc822Name") @Nullable String rfc822Name,
        @CustomType.Parameter("uniformResourceIdentifier") @Nullable String uniformResourceIdentifier) {
        this.directoryName = directoryName;
        this.dnsName = dnsName;
        this.ediPartyName = ediPartyName;
        this.ipAddress = ipAddress;
        this.otherName = otherName;
        this.registeredId = registeredId;
        this.rfc822Name = rfc822Name;
        this.uniformResourceIdentifier = uniformResourceIdentifier;
    }

    public Optional<CertificateAuthoritySubject> directoryName() {
        return Optional.ofNullable(this.directoryName);
    }
    public Optional<String> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    public Optional<CertificateAuthorityEdiPartyName> ediPartyName() {
        return Optional.ofNullable(this.ediPartyName);
    }
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Optional<CertificateAuthorityOtherName> otherName() {
        return Optional.ofNullable(this.otherName);
    }
    public Optional<String> registeredId() {
        return Optional.ofNullable(this.registeredId);
    }
    public Optional<String> rfc822Name() {
        return Optional.ofNullable(this.rfc822Name);
    }
    public Optional<String> uniformResourceIdentifier() {
        return Optional.ofNullable(this.uniformResourceIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityGeneralName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateAuthoritySubject directoryName;
        private @Nullable String dnsName;
        private @Nullable CertificateAuthorityEdiPartyName ediPartyName;
        private @Nullable String ipAddress;
        private @Nullable CertificateAuthorityOtherName otherName;
        private @Nullable String registeredId;
        private @Nullable String rfc822Name;
        private @Nullable String uniformResourceIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityGeneralName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.dnsName = defaults.dnsName;
    	      this.ediPartyName = defaults.ediPartyName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.otherName = defaults.otherName;
    	      this.registeredId = defaults.registeredId;
    	      this.rfc822Name = defaults.rfc822Name;
    	      this.uniformResourceIdentifier = defaults.uniformResourceIdentifier;
        }

        public Builder directoryName(@Nullable CertificateAuthoritySubject directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public Builder ediPartyName(@Nullable CertificateAuthorityEdiPartyName ediPartyName) {
            this.ediPartyName = ediPartyName;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder otherName(@Nullable CertificateAuthorityOtherName otherName) {
            this.otherName = otherName;
            return this;
        }
        public Builder registeredId(@Nullable String registeredId) {
            this.registeredId = registeredId;
            return this;
        }
        public Builder rfc822Name(@Nullable String rfc822Name) {
            this.rfc822Name = rfc822Name;
            return this;
        }
        public Builder uniformResourceIdentifier(@Nullable String uniformResourceIdentifier) {
            this.uniformResourceIdentifier = uniformResourceIdentifier;
            return this;
        }        public CertificateAuthorityGeneralName build() {
            return new CertificateAuthorityGeneralName(directoryName, dnsName, ediPartyName, ipAddress, otherName, registeredId, rfc822Name, uniformResourceIdentifier);
        }
    }
}
