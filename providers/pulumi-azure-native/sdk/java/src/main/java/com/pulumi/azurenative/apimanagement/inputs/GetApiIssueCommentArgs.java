// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetApiIssueCommentArgs extends InvokeArgs {

    public static final GetApiIssueCommentArgs Empty = new GetApiIssueCommentArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String apiId() {
        return this.apiId;
    }

    /**
     * Comment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    @Import(name="commentId", required=true)
    private String commentId;

    /**
     * @return Comment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    public String commentId() {
        return this.commentId;
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="issueId", required=true)
    private String issueId;

    /**
     * @return Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String issueId() {
        return this.issueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetApiIssueCommentArgs() {}

    private GetApiIssueCommentArgs(GetApiIssueCommentArgs $) {
        this.apiId = $.apiId;
        this.commentId = $.commentId;
        this.issueId = $.issueId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiIssueCommentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiIssueCommentArgs $;

        public Builder() {
            $ = new GetApiIssueCommentArgs();
        }

        public Builder(GetApiIssueCommentArgs defaults) {
            $ = new GetApiIssueCommentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param commentId Comment identifier within an Issue. Must be unique in the current Issue.
         * 
         * @return builder
         * 
         */
        public Builder commentId(String commentId) {
            $.commentId = commentId;
            return this;
        }

        /**
         * @param issueId Issue identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder issueId(String issueId) {
            $.issueId = issueId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetApiIssueCommentArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.commentId = Objects.requireNonNull($.commentId, "expected parameter 'commentId' to be non-null");
            $.issueId = Objects.requireNonNull($.issueId, "expected parameter 'issueId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
