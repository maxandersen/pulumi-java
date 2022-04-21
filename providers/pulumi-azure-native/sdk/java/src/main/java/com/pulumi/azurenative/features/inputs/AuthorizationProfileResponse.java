// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Authorization Profile
 * 
 */
public final class AuthorizationProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthorizationProfileResponse Empty = new AuthorizationProfileResponse();

    /**
     * The approved time
     * 
     */
    @Import(name="approvedTime", required=true)
    private String approvedTime;

    public String approvedTime() {
        return this.approvedTime;
    }

    /**
     * The approver
     * 
     */
    @Import(name="approver", required=true)
    private String approver;

    public String approver() {
        return this.approver;
    }

    /**
     * The requested time
     * 
     */
    @Import(name="requestedTime", required=true)
    private String requestedTime;

    public String requestedTime() {
        return this.requestedTime;
    }

    /**
     * The requester
     * 
     */
    @Import(name="requester", required=true)
    private String requester;

    public String requester() {
        return this.requester;
    }

    /**
     * The requester object id
     * 
     */
    @Import(name="requesterObjectId", required=true)
    private String requesterObjectId;

    public String requesterObjectId() {
        return this.requesterObjectId;
    }

    private AuthorizationProfileResponse() {}

    private AuthorizationProfileResponse(AuthorizationProfileResponse $) {
        this.approvedTime = $.approvedTime;
        this.approver = $.approver;
        this.requestedTime = $.requestedTime;
        this.requester = $.requester;
        this.requesterObjectId = $.requesterObjectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationProfileResponse $;

        public Builder() {
            $ = new AuthorizationProfileResponse();
        }

        public Builder(AuthorizationProfileResponse defaults) {
            $ = new AuthorizationProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder approvedTime(String approvedTime) {
            $.approvedTime = approvedTime;
            return this;
        }

        public Builder approver(String approver) {
            $.approver = approver;
            return this;
        }

        public Builder requestedTime(String requestedTime) {
            $.requestedTime = requestedTime;
            return this;
        }

        public Builder requester(String requester) {
            $.requester = requester;
            return this;
        }

        public Builder requesterObjectId(String requesterObjectId) {
            $.requesterObjectId = requesterObjectId;
            return this;
        }

        public AuthorizationProfileResponse build() {
            $.approvedTime = Objects.requireNonNull($.approvedTime, "expected parameter 'approvedTime' to be non-null");
            $.approver = Objects.requireNonNull($.approver, "expected parameter 'approver' to be non-null");
            $.requestedTime = Objects.requireNonNull($.requestedTime, "expected parameter 'requestedTime' to be non-null");
            $.requester = Objects.requireNonNull($.requester, "expected parameter 'requester' to be non-null");
            $.requesterObjectId = Objects.requireNonNull($.requesterObjectId, "expected parameter 'requesterObjectId' to be non-null");
            return $;
        }
    }

}
