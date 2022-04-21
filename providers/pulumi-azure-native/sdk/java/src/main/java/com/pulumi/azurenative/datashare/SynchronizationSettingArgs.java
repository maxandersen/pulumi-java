// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.datashare.enums.SynchronizationSettingKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SynchronizationSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SynchronizationSettingArgs Empty = new SynchronizationSettingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Kind of synchronization setting.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,SynchronizationSettingKind>> kind;

    public Output<Either<String,SynchronizationSettingKind>> kind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the synchronization setting to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * The name of the synchronizationSetting.
     * 
     */
    @Import(name="synchronizationSettingName")
    private @Nullable Output<String> synchronizationSettingName;

    public Optional<Output<String>> synchronizationSettingName() {
        return Optional.ofNullable(this.synchronizationSettingName);
    }

    private SynchronizationSettingArgs() {}

    private SynchronizationSettingArgs(SynchronizationSettingArgs $) {
        this.accountName = $.accountName;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.synchronizationSettingName = $.synchronizationSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SynchronizationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SynchronizationSettingArgs $;

        public Builder() {
            $ = new SynchronizationSettingArgs();
        }

        public Builder(SynchronizationSettingArgs defaults) {
            $ = new SynchronizationSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder kind(Output<Either<String,SynchronizationSettingKind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,SynchronizationSettingKind> kind) {
            return kind(Output.of(kind));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public Builder synchronizationSettingName(@Nullable Output<String> synchronizationSettingName) {
            $.synchronizationSettingName = synchronizationSettingName;
            return this;
        }

        public Builder synchronizationSettingName(String synchronizationSettingName) {
            return synchronizationSettingName(Output.of(synchronizationSettingName));
        }

        public SynchronizationSettingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
