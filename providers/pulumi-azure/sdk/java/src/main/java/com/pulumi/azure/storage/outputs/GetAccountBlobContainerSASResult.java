// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASPermissions;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountBlobContainerSASResult {
    private final @Nullable String cacheControl;
    private final String connectionString;
    private final String containerName;
    private final @Nullable String contentDisposition;
    private final @Nullable String contentEncoding;
    private final @Nullable String contentLanguage;
    private final @Nullable String contentType;
    private final String expiry;
    private final @Nullable Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String ipAddress;
    private final GetAccountBlobContainerSASPermissions permissions;
    /**
     * @return The computed Blob Container Shared Access Signature (SAS).
     * 
     */
    private final String sas;
    private final String start;

    @CustomType.Constructor
    private GetAccountBlobContainerSASResult(
        @CustomType.Parameter("cacheControl") @Nullable String cacheControl,
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("contentDisposition") @Nullable String contentDisposition,
        @CustomType.Parameter("contentEncoding") @Nullable String contentEncoding,
        @CustomType.Parameter("contentLanguage") @Nullable String contentLanguage,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("expiry") String expiry,
        @CustomType.Parameter("httpsOnly") @Nullable Boolean httpsOnly,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("permissions") GetAccountBlobContainerSASPermissions permissions,
        @CustomType.Parameter("sas") String sas,
        @CustomType.Parameter("start") String start) {
        this.cacheControl = cacheControl;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;
        this.expiry = expiry;
        this.httpsOnly = httpsOnly;
        this.id = id;
        this.ipAddress = ipAddress;
        this.permissions = permissions;
        this.sas = sas;
        this.start = start;
    }

    public Optional<String> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }
    public String connectionString() {
        return this.connectionString;
    }
    public String containerName() {
        return this.containerName;
    }
    public Optional<String> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }
    public Optional<String> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public String expiry() {
        return this.expiry;
    }
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public GetAccountBlobContainerSASPermissions permissions() {
        return this.permissions;
    }
    /**
     * @return The computed Blob Container Shared Access Signature (SAS).
     * 
     */
    public String sas() {
        return this.sas;
    }
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountBlobContainerSASResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cacheControl;
        private String connectionString;
        private String containerName;
        private @Nullable String contentDisposition;
        private @Nullable String contentEncoding;
        private @Nullable String contentLanguage;
        private @Nullable String contentType;
        private String expiry;
        private @Nullable Boolean httpsOnly;
        private String id;
        private @Nullable String ipAddress;
        private GetAccountBlobContainerSASPermissions permissions;
        private String sas;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountBlobContainerSASResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheControl = defaults.cacheControl;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.expiry = defaults.expiry;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.permissions = defaults.permissions;
    	      this.sas = defaults.sas;
    	      this.start = defaults.start;
        }

        public Builder cacheControl(@Nullable String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder contentDisposition(@Nullable String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }
        public Builder contentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public Builder contentLanguage(@Nullable String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder expiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder permissions(GetAccountBlobContainerSASPermissions permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder sas(String sas) {
            this.sas = Objects.requireNonNull(sas);
            return this;
        }
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }        public GetAccountBlobContainerSASResult build() {
            return new GetAccountBlobContainerSASResult(cacheControl, connectionString, containerName, contentDisposition, contentEncoding, contentLanguage, contentType, expiry, httpsOnly, id, ipAddress, permissions, sas, start);
        }
    }
}
