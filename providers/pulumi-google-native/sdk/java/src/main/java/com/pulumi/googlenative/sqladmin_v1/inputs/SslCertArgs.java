// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SslCerts Resource
 * 
 */
public final class SslCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslCertArgs Empty = new SslCertArgs();

    /**
     * PEM representation.
     * 
     */
    @Import(name="cert")
      private final @Nullable Output<String> cert;

    public Output<String> cert() {
        return this.cert == null ? Codegen.empty() : this.cert;
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Import(name="certSerialNumber")
      private final @Nullable Output<String> certSerialNumber;

    public Output<String> certSerialNumber() {
        return this.certSerialNumber == null ? Codegen.empty() : this.certSerialNumber;
    }

    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> commonName() {
        return this.commonName == null ? Codegen.empty() : this.commonName;
    }

    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> expirationTime() {
        return this.expirationTime == null ? Codegen.empty() : this.expirationTime;
    }

    /**
     * Name of the database instance.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    /**
     * This is always `sql#sslCert`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The URI of this resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * Sha1 Fingerprint.
     * 
     */
    @Import(name="sha1Fingerprint")
      private final @Nullable Output<String> sha1Fingerprint;

    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint == null ? Codegen.empty() : this.sha1Fingerprint;
    }

    public SslCertArgs(
        @Nullable Output<String> cert,
        @Nullable Output<String> certSerialNumber,
        @Nullable Output<String> commonName,
        @Nullable Output<String> createTime,
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> instance,
        @Nullable Output<String> kind,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> sha1Fingerprint) {
        this.cert = cert;
        this.certSerialNumber = certSerialNumber;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.instance = instance;
        this.kind = kind;
        this.selfLink = selfLink;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private SslCertArgs() {
        this.cert = Codegen.empty();
        this.certSerialNumber = Codegen.empty();
        this.commonName = Codegen.empty();
        this.createTime = Codegen.empty();
        this.expirationTime = Codegen.empty();
        this.instance = Codegen.empty();
        this.kind = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.sha1Fingerprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cert;
        private @Nullable Output<String> certSerialNumber;
        private @Nullable Output<String> commonName;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.certSerialNumber = defaults.certSerialNumber;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.selfLink = defaults.selfLink;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(@Nullable Output<String> cert) {
            this.cert = cert;
            return this;
        }
        public Builder cert(@Nullable String cert) {
            this.cert = Codegen.ofNullable(cert);
            return this;
        }
        public Builder certSerialNumber(@Nullable Output<String> certSerialNumber) {
            this.certSerialNumber = certSerialNumber;
            return this;
        }
        public Builder certSerialNumber(@Nullable String certSerialNumber) {
            this.certSerialNumber = Codegen.ofNullable(certSerialNumber);
            return this;
        }
        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder commonName(@Nullable String commonName) {
            this.commonName = Codegen.ofNullable(commonName);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Codegen.ofNullable(expirationTime);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
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
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }
        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Codegen.ofNullable(sha1Fingerprint);
            return this;
        }        public SslCertArgs build() {
            return new SslCertArgs(cert, certSerialNumber, commonName, createTime, expirationTime, instance, kind, selfLink, sha1Fingerprint);
        }
    }
}
