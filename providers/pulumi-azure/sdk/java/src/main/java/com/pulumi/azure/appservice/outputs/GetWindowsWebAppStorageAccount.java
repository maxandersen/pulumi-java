// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppStorageAccount {
    /**
     * @return The Access key for the storage account.
     * 
     */
    private final String accessKey;
    /**
     * @return The Name of the Storage Account.
     * 
     */
    private final String accountName;
    /**
     * @return The path at which to mount the Storage Share.
     * 
     */
    private final String mountPath;
    /**
     * @return The name of this Windows Web App.
     * 
     */
    private final String name;
    /**
     * @return The Name of the File Share.
     * 
     */
    private final String shareName;
    /**
     * @return The Azure Storage Type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWindowsWebAppStorageAccount(
        @CustomType.Parameter("accessKey") String accessKey,
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("shareName") String shareName,
        @CustomType.Parameter("type") String type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.mountPath = mountPath;
        this.name = name;
        this.shareName = shareName;
        this.type = type;
    }

    /**
     * @return The Access key for the storage account.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The Name of the Storage Account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The path at which to mount the Storage Share.
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return The name of this Windows Web App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Name of the File Share.
     * 
     */
    public String shareName() {
        return this.shareName;
    }
    /**
     * @return The Azure Storage Type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppStorageAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey;
        private String accountName;
        private String mountPath;
        private String name;
        private String shareName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.shareName = defaults.shareName;
    	      this.type = defaults.type;
        }

        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWindowsWebAppStorageAccount build() {
            return new GetWindowsWebAppStorageAccount(accessKey, accountName, mountPath, name, shareName, type);
        }
    }
}
