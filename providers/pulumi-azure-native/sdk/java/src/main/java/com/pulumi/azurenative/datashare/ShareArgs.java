// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.datashare.enums.ShareKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

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
     * Share description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * Share kind.
     * 
     */
    @Import(name="shareKind")
    private @Nullable Output<Either<String,ShareKind>> shareKind;

    public Optional<Output<Either<String,ShareKind>>> shareKind() {
        return Optional.ofNullable(this.shareKind);
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * Share terms.
     * 
     */
    @Import(name="terms")
    private @Nullable Output<String> terms;

    public Optional<Output<String>> terms() {
        return Optional.ofNullable(this.terms);
    }

    private ShareArgs() {}

    private ShareArgs(ShareArgs $) {
        this.accountName = $.accountName;
        this.description = $.description;
        this.resourceGroupName = $.resourceGroupName;
        this.shareKind = $.shareKind;
        this.shareName = $.shareName;
        this.terms = $.terms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareArgs $;

        public Builder() {
            $ = new ShareArgs();
        }

        public Builder(ShareArgs defaults) {
            $ = new ShareArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder shareKind(@Nullable Output<Either<String,ShareKind>> shareKind) {
            $.shareKind = shareKind;
            return this;
        }

        public Builder shareKind(Either<String,ShareKind> shareKind) {
            return shareKind(Output.of(shareKind));
        }

        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public Builder terms(@Nullable Output<String> terms) {
            $.terms = terms;
            return this;
        }

        public Builder terms(String terms) {
            return terms(Output.of(terms));
        }

        public ShareArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
