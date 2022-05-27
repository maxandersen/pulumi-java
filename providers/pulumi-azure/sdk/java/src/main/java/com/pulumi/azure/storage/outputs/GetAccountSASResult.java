// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetAccountSASPermissions;
import com.pulumi.azure.storage.outputs.GetAccountSASResourceTypes;
import com.pulumi.azure.storage.outputs.GetAccountSASServices;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountSASResult {
    private final String connectionString;
    private final String expiry;
    private final @Nullable Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String ipAddresses;
    private final GetAccountSASPermissions permissions;
    private final GetAccountSASResourceTypes resourceTypes;
    /**
     * @return The computed Account Shared Access Signature (SAS).
     * 
     */
    private final String sas;
    private final GetAccountSASServices services;
    private final @Nullable String signedVersion;
    private final String start;

    @CustomType.Constructor
    private GetAccountSASResult(
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("expiry") String expiry,
        @CustomType.Parameter("httpsOnly") @Nullable Boolean httpsOnly,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddresses") @Nullable String ipAddresses,
        @CustomType.Parameter("permissions") GetAccountSASPermissions permissions,
        @CustomType.Parameter("resourceTypes") GetAccountSASResourceTypes resourceTypes,
        @CustomType.Parameter("sas") String sas,
        @CustomType.Parameter("services") GetAccountSASServices services,
        @CustomType.Parameter("signedVersion") @Nullable String signedVersion,
        @CustomType.Parameter("start") String start) {
        this.connectionString = connectionString;
        this.expiry = expiry;
        this.httpsOnly = httpsOnly;
        this.id = id;
        this.ipAddresses = ipAddresses;
        this.permissions = permissions;
        this.resourceTypes = resourceTypes;
        this.sas = sas;
        this.services = services;
        this.signedVersion = signedVersion;
        this.start = start;
    }

    public String connectionString() {
        return this.connectionString;
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
    public Optional<String> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }
    public GetAccountSASPermissions permissions() {
        return this.permissions;
    }
    public GetAccountSASResourceTypes resourceTypes() {
        return this.resourceTypes;
    }
    /**
     * @return The computed Account Shared Access Signature (SAS).
     * 
     */
    public String sas() {
        return this.sas;
    }
    public GetAccountSASServices services() {
        return this.services;
    }
    public Optional<String> signedVersion() {
        return Optional.ofNullable(this.signedVersion);
    }
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountSASResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionString;
        private String expiry;
        private @Nullable Boolean httpsOnly;
        private String id;
        private @Nullable String ipAddresses;
        private GetAccountSASPermissions permissions;
        private GetAccountSASResourceTypes resourceTypes;
        private String sas;
        private GetAccountSASServices services;
        private @Nullable String signedVersion;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountSASResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.expiry = defaults.expiry;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.permissions = defaults.permissions;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.sas = defaults.sas;
    	      this.services = defaults.services;
    	      this.signedVersion = defaults.signedVersion;
    	      this.start = defaults.start;
        }

        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
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
        public Builder ipAddresses(@Nullable String ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder permissions(GetAccountSASPermissions permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder resourceTypes(GetAccountSASResourceTypes resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public Builder sas(String sas) {
            this.sas = Objects.requireNonNull(sas);
            return this;
        }
        public Builder services(GetAccountSASServices services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder signedVersion(@Nullable String signedVersion) {
            this.signedVersion = signedVersion;
            return this;
        }
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }        public GetAccountSASResult build() {
            return new GetAccountSASResult(connectionString, expiry, httpsOnly, id, ipAddresses, permissions, resourceTypes, sas, services, signedVersion, start);
        }
    }
}
