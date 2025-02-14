// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<String> cert;

    /**
     * @return PEM representation.
     * 
     */
    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Import(name="certSerialNumber")
    private @Nullable Output<String> certSerialNumber;

    /**
     * @return Serial number, as extracted from the certificate.
     * 
     */
    public Optional<Output<String>> certSerialNumber() {
        return Optional.ofNullable(this.certSerialNumber);
    }

    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * Name of the database instance.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return Name of the database instance.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * This is always `sql#sslCert`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return This is always `sql#sslCert`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The URI of this resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * Sha1 Fingerprint.
     * 
     */
    @Import(name="sha1Fingerprint")
    private @Nullable Output<String> sha1Fingerprint;

    /**
     * @return Sha1 Fingerprint.
     * 
     */
    public Optional<Output<String>> sha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }

    private SslCertArgs() {}

    private SslCertArgs(SslCertArgs $) {
        this.cert = $.cert;
        this.certSerialNumber = $.certSerialNumber;
        this.commonName = $.commonName;
        this.createTime = $.createTime;
        this.expirationTime = $.expirationTime;
        this.instance = $.instance;
        this.kind = $.kind;
        this.selfLink = $.selfLink;
        this.sha1Fingerprint = $.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslCertArgs $;

        public Builder() {
            $ = new SslCertArgs();
        }

        public Builder(SslCertArgs defaults) {
            $ = new SslCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cert PEM representation.
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert PEM representation.
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param certSerialNumber Serial number, as extracted from the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certSerialNumber(@Nullable Output<String> certSerialNumber) {
            $.certSerialNumber = certSerialNumber;
            return this;
        }

        /**
         * @param certSerialNumber Serial number, as extracted from the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certSerialNumber(String certSerialNumber) {
            return certSerialNumber(Output.of(certSerialNumber));
        }

        /**
         * @param commonName User supplied name. Constrained to [a-zA-Z.-_ ]+.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName User supplied name. Constrained to [a-zA-Z.-_ ]+.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param createTime The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param expirationTime The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param instance Name of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance Name of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param kind This is always `sql#sslCert`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind This is always `sql#sslCert`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param selfLink The URI of this resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of this resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param sha1Fingerprint Sha1 Fingerprint.
         * 
         * @return builder
         * 
         */
        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            $.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        /**
         * @param sha1Fingerprint Sha1 Fingerprint.
         * 
         * @return builder
         * 
         */
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            return sha1Fingerprint(Output.of(sha1Fingerprint));
        }

        public SslCertArgs build() {
            return $;
        }
    }

}
