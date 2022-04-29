// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage account information for storing Service Fabric diagnostic logs.
 * 
 */
public final class DiagnosticsStorageAccountConfigArgs extends ResourceArgs {

    public static final DiagnosticsStorageAccountConfigArgs Empty = new DiagnosticsStorageAccountConfigArgs();

    /**
     * The blob endpoint of the azure storage account.
     * 
     */
    @Import(name="blobEndpoint", required=true)
    private Output<String> blobEndpoint;

    /**
     * @return The blob endpoint of the azure storage account.
     * 
     */
    public Output<String> blobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * The protected diagnostics storage key name.
     * 
     */
    @Import(name="protectedAccountKeyName", required=true)
    private Output<String> protectedAccountKeyName;

    /**
     * @return The protected diagnostics storage key name.
     * 
     */
    public Output<String> protectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }

    /**
     * The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
     * 
     */
    @Import(name="protectedAccountKeyName2")
    private @Nullable Output<String> protectedAccountKeyName2;

    /**
     * @return The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
     * 
     */
    public Optional<Output<String>> protectedAccountKeyName2() {
        return Optional.ofNullable(this.protectedAccountKeyName2);
    }

    /**
     * The queue endpoint of the azure storage account.
     * 
     */
    @Import(name="queueEndpoint", required=true)
    private Output<String> queueEndpoint;

    /**
     * @return The queue endpoint of the azure storage account.
     * 
     */
    public Output<String> queueEndpoint() {
        return this.queueEndpoint;
    }

    /**
     * The Azure storage account name.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return The Azure storage account name.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * The table endpoint of the azure storage account.
     * 
     */
    @Import(name="tableEndpoint", required=true)
    private Output<String> tableEndpoint;

    /**
     * @return The table endpoint of the azure storage account.
     * 
     */
    public Output<String> tableEndpoint() {
        return this.tableEndpoint;
    }

    private DiagnosticsStorageAccountConfigArgs() {}

    private DiagnosticsStorageAccountConfigArgs(DiagnosticsStorageAccountConfigArgs $) {
        this.blobEndpoint = $.blobEndpoint;
        this.protectedAccountKeyName = $.protectedAccountKeyName;
        this.protectedAccountKeyName2 = $.protectedAccountKeyName2;
        this.queueEndpoint = $.queueEndpoint;
        this.storageAccountName = $.storageAccountName;
        this.tableEndpoint = $.tableEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsStorageAccountConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsStorageAccountConfigArgs $;

        public Builder() {
            $ = new DiagnosticsStorageAccountConfigArgs();
        }

        public Builder(DiagnosticsStorageAccountConfigArgs defaults) {
            $ = new DiagnosticsStorageAccountConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobEndpoint The blob endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder blobEndpoint(Output<String> blobEndpoint) {
            $.blobEndpoint = blobEndpoint;
            return this;
        }

        /**
         * @param blobEndpoint The blob endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder blobEndpoint(String blobEndpoint) {
            return blobEndpoint(Output.of(blobEndpoint));
        }

        /**
         * @param protectedAccountKeyName The protected diagnostics storage key name.
         * 
         * @return builder
         * 
         */
        public Builder protectedAccountKeyName(Output<String> protectedAccountKeyName) {
            $.protectedAccountKeyName = protectedAccountKeyName;
            return this;
        }

        /**
         * @param protectedAccountKeyName The protected diagnostics storage key name.
         * 
         * @return builder
         * 
         */
        public Builder protectedAccountKeyName(String protectedAccountKeyName) {
            return protectedAccountKeyName(Output.of(protectedAccountKeyName));
        }

        /**
         * @param protectedAccountKeyName2 The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
         * 
         * @return builder
         * 
         */
        public Builder protectedAccountKeyName2(@Nullable Output<String> protectedAccountKeyName2) {
            $.protectedAccountKeyName2 = protectedAccountKeyName2;
            return this;
        }

        /**
         * @param protectedAccountKeyName2 The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
         * 
         * @return builder
         * 
         */
        public Builder protectedAccountKeyName2(String protectedAccountKeyName2) {
            return protectedAccountKeyName2(Output.of(protectedAccountKeyName2));
        }

        /**
         * @param queueEndpoint The queue endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder queueEndpoint(Output<String> queueEndpoint) {
            $.queueEndpoint = queueEndpoint;
            return this;
        }

        /**
         * @param queueEndpoint The queue endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder queueEndpoint(String queueEndpoint) {
            return queueEndpoint(Output.of(queueEndpoint));
        }

        /**
         * @param storageAccountName The Azure storage account name.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The Azure storage account name.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param tableEndpoint The table endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder tableEndpoint(Output<String> tableEndpoint) {
            $.tableEndpoint = tableEndpoint;
            return this;
        }

        /**
         * @param tableEndpoint The table endpoint of the azure storage account.
         * 
         * @return builder
         * 
         */
        public Builder tableEndpoint(String tableEndpoint) {
            return tableEndpoint(Output.of(tableEndpoint));
        }

        public DiagnosticsStorageAccountConfigArgs build() {
            $.blobEndpoint = Objects.requireNonNull($.blobEndpoint, "expected parameter 'blobEndpoint' to be non-null");
            $.protectedAccountKeyName = Objects.requireNonNull($.protectedAccountKeyName, "expected parameter 'protectedAccountKeyName' to be non-null");
            $.queueEndpoint = Objects.requireNonNull($.queueEndpoint, "expected parameter 'queueEndpoint' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.tableEndpoint = Objects.requireNonNull($.tableEndpoint, "expected parameter 'tableEndpoint' to be non-null");
            return $;
        }
    }

}
