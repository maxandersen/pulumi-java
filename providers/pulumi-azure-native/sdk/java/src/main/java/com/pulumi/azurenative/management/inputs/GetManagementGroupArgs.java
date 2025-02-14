// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagementGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementGroupArgs Empty = new GetManagementGroupArgs();

    /**
     * The $expand=children query string parameter allows clients to request inclusion of children in the response payload.  $expand=path includes the path from the root group to the current group.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The $expand=children query string parameter allows clients to request inclusion of children in the response payload.  $expand=path includes the path from the root group to the current group.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * A filter which allows the exclusion of subscriptions from results (i.e. &#39;$filter=children.childType ne Subscription&#39;)
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    /**
     * @return A filter which allows the exclusion of subscriptions from results (i.e. &#39;$filter=children.childType ne Subscription&#39;)
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Management Group ID.
     * 
     */
    @Import(name="groupId", required=true)
    private String groupId;

    /**
     * @return Management Group ID.
     * 
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * The $recurse=true query string parameter allows clients to request inclusion of entire hierarchy in the response payload. Note that  $expand=children must be passed up if $recurse is set to true.
     * 
     */
    @Import(name="recurse")
    private @Nullable Boolean recurse;

    /**
     * @return The $recurse=true query string parameter allows clients to request inclusion of entire hierarchy in the response payload. Note that  $expand=children must be passed up if $recurse is set to true.
     * 
     */
    public Optional<Boolean> recurse() {
        return Optional.ofNullable(this.recurse);
    }

    private GetManagementGroupArgs() {}

    private GetManagementGroupArgs(GetManagementGroupArgs $) {
        this.expand = $.expand;
        this.filter = $.filter;
        this.groupId = $.groupId;
        this.recurse = $.recurse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementGroupArgs $;

        public Builder() {
            $ = new GetManagementGroupArgs();
        }

        public Builder(GetManagementGroupArgs defaults) {
            $ = new GetManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The $expand=children query string parameter allows clients to request inclusion of children in the response payload.  $expand=path includes the path from the root group to the current group.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param filter A filter which allows the exclusion of subscriptions from results (i.e. &#39;$filter=children.childType ne Subscription&#39;)
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param groupId Management Group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param recurse The $recurse=true query string parameter allows clients to request inclusion of entire hierarchy in the response payload. Note that  $expand=children must be passed up if $recurse is set to true.
         * 
         * @return builder
         * 
         */
        public Builder recurse(@Nullable Boolean recurse) {
            $.recurse = recurse;
            return this;
        }

        public GetManagementGroupArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            return $;
        }
    }

}
