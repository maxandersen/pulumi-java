// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPullRequestGetArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerGithubPushGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerGithubGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerGithubGetArgs Empty = new TriggerGithubGetArgs();

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner of the repository. For example: The owner for
     * https://github.com/googlecloudplatform/cloud-builders is &#34;googlecloudplatform&#34;.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * filter to match changes in pull requests. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
     */
    @Import(name="pullRequest")
    private @Nullable Output<TriggerGithubPullRequestGetArgs> pullRequest;

    public Optional<Output<TriggerGithubPullRequestGetArgs>> pullRequest() {
        return Optional.ofNullable(this.pullRequest);
    }

    /**
     * filter to match changes in refs, like branches or tags. Specify only one of `pull_request` or `push`.
     * Structure is documented below.
     * 
     */
    @Import(name="push")
    private @Nullable Output<TriggerGithubPushGetArgs> push;

    public Optional<Output<TriggerGithubPushGetArgs>> push() {
        return Optional.ofNullable(this.push);
    }

    private TriggerGithubGetArgs() {}

    private TriggerGithubGetArgs(TriggerGithubGetArgs $) {
        this.name = $.name;
        this.owner = $.owner;
        this.pullRequest = $.pullRequest;
        this.push = $.push;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerGithubGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerGithubGetArgs $;

        public Builder() {
            $ = new TriggerGithubGetArgs();
        }

        public Builder(TriggerGithubGetArgs defaults) {
            $ = new TriggerGithubGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder pullRequest(@Nullable Output<TriggerGithubPullRequestGetArgs> pullRequest) {
            $.pullRequest = pullRequest;
            return this;
        }

        public Builder pullRequest(TriggerGithubPullRequestGetArgs pullRequest) {
            return pullRequest(Output.of(pullRequest));
        }

        public Builder push(@Nullable Output<TriggerGithubPushGetArgs> push) {
            $.push = push;
            return this;
        }

        public Builder push(TriggerGithubPushGetArgs push) {
            return push(Output.of(push));
        }

        public TriggerGithubGetArgs build() {
            return $;
        }
    }

}
