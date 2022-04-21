// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Properties describing the software upgrade state of the Cache.
 * 
 */
public final class CacheUpgradeStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final CacheUpgradeStatusResponse Empty = new CacheUpgradeStatusResponse();

    /**
     * Version string of the firmware currently installed on this Cache.
     * 
     */
    @Import(name="currentFirmwareVersion", required=true)
    private String currentFirmwareVersion;

    public String currentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /**
     * Time at which the pending firmware update will automatically be installed on the Cache.
     * 
     */
    @Import(name="firmwareUpdateDeadline", required=true)
    private String firmwareUpdateDeadline;

    public String firmwareUpdateDeadline() {
        return this.firmwareUpdateDeadline;
    }

    /**
     * True if there is a firmware update ready to install on this Cache. The firmware will automatically be installed after firmwareUpdateDeadline if not triggered earlier via the upgrade operation.
     * 
     */
    @Import(name="firmwareUpdateStatus", required=true)
    private String firmwareUpdateStatus;

    public String firmwareUpdateStatus() {
        return this.firmwareUpdateStatus;
    }

    /**
     * Time of the last successful firmware update.
     * 
     */
    @Import(name="lastFirmwareUpdate", required=true)
    private String lastFirmwareUpdate;

    public String lastFirmwareUpdate() {
        return this.lastFirmwareUpdate;
    }

    /**
     * When firmwareUpdateAvailable is true, this field holds the version string for the update.
     * 
     */
    @Import(name="pendingFirmwareVersion", required=true)
    private String pendingFirmwareVersion;

    public String pendingFirmwareVersion() {
        return this.pendingFirmwareVersion;
    }

    private CacheUpgradeStatusResponse() {}

    private CacheUpgradeStatusResponse(CacheUpgradeStatusResponse $) {
        this.currentFirmwareVersion = $.currentFirmwareVersion;
        this.firmwareUpdateDeadline = $.firmwareUpdateDeadline;
        this.firmwareUpdateStatus = $.firmwareUpdateStatus;
        this.lastFirmwareUpdate = $.lastFirmwareUpdate;
        this.pendingFirmwareVersion = $.pendingFirmwareVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheUpgradeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheUpgradeStatusResponse $;

        public Builder() {
            $ = new CacheUpgradeStatusResponse();
        }

        public Builder(CacheUpgradeStatusResponse defaults) {
            $ = new CacheUpgradeStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder currentFirmwareVersion(String currentFirmwareVersion) {
            $.currentFirmwareVersion = currentFirmwareVersion;
            return this;
        }

        public Builder firmwareUpdateDeadline(String firmwareUpdateDeadline) {
            $.firmwareUpdateDeadline = firmwareUpdateDeadline;
            return this;
        }

        public Builder firmwareUpdateStatus(String firmwareUpdateStatus) {
            $.firmwareUpdateStatus = firmwareUpdateStatus;
            return this;
        }

        public Builder lastFirmwareUpdate(String lastFirmwareUpdate) {
            $.lastFirmwareUpdate = lastFirmwareUpdate;
            return this;
        }

        public Builder pendingFirmwareVersion(String pendingFirmwareVersion) {
            $.pendingFirmwareVersion = pendingFirmwareVersion;
            return this;
        }

        public CacheUpgradeStatusResponse build() {
            $.currentFirmwareVersion = Objects.requireNonNull($.currentFirmwareVersion, "expected parameter 'currentFirmwareVersion' to be non-null");
            $.firmwareUpdateDeadline = Objects.requireNonNull($.firmwareUpdateDeadline, "expected parameter 'firmwareUpdateDeadline' to be non-null");
            $.firmwareUpdateStatus = Objects.requireNonNull($.firmwareUpdateStatus, "expected parameter 'firmwareUpdateStatus' to be non-null");
            $.lastFirmwareUpdate = Objects.requireNonNull($.lastFirmwareUpdate, "expected parameter 'lastFirmwareUpdate' to be non-null");
            $.pendingFirmwareVersion = Objects.requireNonNull($.pendingFirmwareVersion, "expected parameter 'pendingFirmwareVersion' to be non-null");
            return $;
        }
    }

}
