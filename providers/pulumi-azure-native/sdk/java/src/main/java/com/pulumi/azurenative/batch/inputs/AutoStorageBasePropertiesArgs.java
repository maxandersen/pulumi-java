// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The properties related to the auto-storage account.
 * 
 */
public final class AutoStorageBasePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoStorageBasePropertiesArgs Empty = new AutoStorageBasePropertiesArgs();

    /**
     * The resource ID of the storage account to be used for auto-storage account.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private AutoStorageBasePropertiesArgs() {}

    private AutoStorageBasePropertiesArgs(AutoStorageBasePropertiesArgs $) {
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoStorageBasePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoStorageBasePropertiesArgs $;

        public Builder() {
            $ = new AutoStorageBasePropertiesArgs();
        }

        public Builder(AutoStorageBasePropertiesArgs defaults) {
            $ = new AutoStorageBasePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public AutoStorageBasePropertiesArgs build() {
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}
