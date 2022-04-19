// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePrincipalCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalCertificateState Empty = new ServicePrincipalCertificateState();

    /**
     * Specifies the encoding used for the supplied certificate data. Must be one of `pem`, `base64` or `hex`. Defaults to `pem`.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> encoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    /**
     * The end date until which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="endDate")
      private final @Nullable Output<String> endDate;

    public Output<String> endDate() {
        return this.endDate == null ? Codegen.empty() : this.endDate;
    }

    /**
     * A relative duration for which the certificate is valid until, for example `240h` (10 days) or `2400h30m`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="endDateRelative")
      private final @Nullable Output<String> endDateRelative;

    public Output<String> endDateRelative() {
        return this.endDateRelative == null ? Codegen.empty() : this.endDateRelative;
    }

    /**
     * A UUID used to uniquely identify this certificate. If not specified a UUID will be automatically generated. Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * The object ID of the service principal for which this certificate should be created. Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<String> servicePrincipalId;

    public Output<String> servicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * The start date from which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). If this isn't specified, the current date is used.  Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="startDate")
      private final @Nullable Output<String> startDate;

    public Output<String> startDate() {
        return this.startDate == null ? Codegen.empty() : this.startDate;
    }

    /**
     * The type of key/certificate. Must be one of `AsymmetricX509Cert` or `Symmetric`. Changing this fields forces a new resource to be created.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The certificate data, which can be PEM encoded, base64 encoded DER or hexadecimal encoded DER. See also the `encoding` argument.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ServicePrincipalCertificateState(
        @Nullable Output<String> encoding,
        @Nullable Output<String> endDate,
        @Nullable Output<String> endDateRelative,
        @Nullable Output<String> keyId,
        @Nullable Output<String> servicePrincipalId,
        @Nullable Output<String> startDate,
        @Nullable Output<String> type,
        @Nullable Output<String> value) {
        this.encoding = encoding;
        this.endDate = endDate;
        this.endDateRelative = endDateRelative;
        this.keyId = keyId;
        this.servicePrincipalId = servicePrincipalId;
        this.startDate = startDate;
        this.type = type;
        this.value = value;
    }

    private ServicePrincipalCertificateState() {
        this.encoding = Codegen.empty();
        this.endDate = Codegen.empty();
        this.endDateRelative = Codegen.empty();
        this.keyId = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.startDate = Codegen.empty();
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encoding;
        private @Nullable Output<String> endDate;
        private @Nullable Output<String> endDateRelative;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> servicePrincipalId;
        private @Nullable Output<String> startDate;
        private @Nullable Output<String> type;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.endDate = defaults.endDate;
    	      this.endDateRelative = defaults.endDateRelative;
    	      this.keyId = defaults.keyId;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.startDate = defaults.startDate;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder endDate(@Nullable Output<String> endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder endDate(@Nullable String endDate) {
            this.endDate = Codegen.ofNullable(endDate);
            return this;
        }
        public Builder endDateRelative(@Nullable Output<String> endDateRelative) {
            this.endDateRelative = endDateRelative;
            return this;
        }
        public Builder endDateRelative(@Nullable String endDateRelative) {
            this.endDateRelative = Codegen.ofNullable(endDateRelative);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalId(@Nullable String servicePrincipalId) {
            this.servicePrincipalId = Codegen.ofNullable(servicePrincipalId);
            return this;
        }
        public Builder startDate(@Nullable Output<String> startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder startDate(@Nullable String startDate) {
            this.startDate = Codegen.ofNullable(startDate);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ServicePrincipalCertificateState build() {
            return new ServicePrincipalCertificateState(encoding, endDate, endDateRelative, keyId, servicePrincipalId, startDate, type, value);
        }
    }
}
