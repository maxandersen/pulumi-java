// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.ArtifactsResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.BuildApprovalResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.BuildOptionsResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.BuildStepResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.FailureInfoResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.ResultsResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.SecretResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.SecretsResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.SourceProvenanceResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.SourceResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.WarningResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A build resource in the Cloud Build API. At a high level, a `Build` describes where to find source code, how to build it (for example, the builder image to run on the source), and where to store the built artifacts. Fields can include the following variables, which will be expanded when the build is created: - $PROJECT_ID: the project ID of the build. - $PROJECT_NUMBER: the project number of the build. - $LOCATION: the location/region of the build. - $BUILD_ID: the autogenerated ID of the build. - $REPO_NAME: the source repository name specified by RepoSource. - $BRANCH_NAME: the branch name specified by RepoSource. - $TAG_NAME: the tag name specified by RepoSource. - $REVISION_ID or $COMMIT_SHA: the commit SHA specified by RepoSource or resolved from the specified branch or tag. - $SHORT_SHA: first 7 characters of $REVISION_ID or $COMMIT_SHA.
 * 
 */
public final class BuildResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildResponse Empty = new BuildResponse();

    /**
     * Describes this build&#39;s approval configuration, status, and result.
     * 
     */
    @Import(name="approval", required=true)
      private final BuildApprovalResponse approval;

    public BuildApprovalResponse approval() {
        return this.approval;
    }

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    @Import(name="artifacts", required=true)
      private final ArtifactsResponse artifacts;

    public ArtifactsResponse artifacts() {
        return this.artifacts;
    }

    /**
     * Secrets and secret environment variables.
     * 
     */
    @Import(name="availableSecrets", required=true)
      private final SecretsResponse availableSecrets;

    public SecretsResponse availableSecrets() {
        return this.availableSecrets;
    }

    /**
     * The ID of the `BuildTrigger` that triggered this build, if it was triggered automatically.
     * 
     */
    @Import(name="buildTriggerId", required=true)
      private final String buildTriggerId;

    public String buildTriggerId() {
        return this.buildTriggerId;
    }

    /**
     * Time at which the request to create the build was received.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Contains information about the build when status=FAILURE.
     * 
     */
    @Import(name="failureInfo", required=true)
      private final FailureInfoResponse failureInfo;

    public FailureInfoResponse failureInfo() {
        return this.failureInfo;
    }

    /**
     * Time at which execution of the build was finished. The difference between finish_time and start_time is the duration of the build&#39;s execution.
     * 
     */
    @Import(name="finishTime", required=true)
      private final String finishTime;

    public String finishTime() {
        return this.finishTime;
    }

    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
     * 
     */
    @Import(name="images", required=true)
      private final List<String> images;

    public List<String> images() {
        return this.images;
    }

    /**
     * URL to logs for this build in Google Cloud Console.
     * 
     */
    @Import(name="logUrl", required=true)
      private final String logUrl;

    public String logUrl() {
        return this.logUrl;
    }

    /**
     * Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     * 
     */
    @Import(name="logsBucket", required=true)
      private final String logsBucket;

    public String logsBucket() {
        return this.logsBucket;
    }

    /**
     * The &#39;Build&#39; name with format: `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier generated by the service.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Special options for this build.
     * 
     */
    @Import(name="options", required=true)
      private final BuildOptionsResponse options;

    public BuildOptionsResponse options() {
        return this.options;
    }

    /**
     * ID of the project.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
     * 
     */
    @Import(name="queueTtl", required=true)
      private final String queueTtl;

    public String queueTtl() {
        return this.queueTtl;
    }

    /**
     * Results of the build.
     * 
     */
    @Import(name="results", required=true)
      private final ResultsResponse results;

    public ResultsResponse results() {
        return this.results;
    }

    /**
     * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
     * 
     */
    @Import(name="secrets", required=true)
      private final List<SecretResponse> secrets;

    public List<SecretResponse> secrets() {
        return this.secrets;
    }

    /**
     * IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * The location of the source files to build.
     * 
     */
    @Import(name="source", required=true)
      private final SourceResponse source;

    public SourceResponse source() {
        return this.source;
    }

    /**
     * A permanent fixed identifier for source.
     * 
     */
    @Import(name="sourceProvenance", required=true)
      private final SourceProvenanceResponse sourceProvenance;

    public SourceProvenanceResponse sourceProvenance() {
        return this.sourceProvenance;
    }

    /**
     * Time at which execution of the build was started.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Status of the build.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * Customer-readable message about the current status.
     * 
     */
    @Import(name="statusDetail", required=true)
      private final String statusDetail;

    public String statusDetail() {
        return this.statusDetail;
    }

    /**
     * The operations to be performed on the workspace.
     * 
     */
    @Import(name="steps", required=true)
      private final List<BuildStepResponse> steps;

    public List<BuildStepResponse> steps() {
        return this.steps;
    }

    /**
     * Substitutions data for `Build` resource.
     * 
     */
    @Import(name="substitutions", required=true)
      private final Map<String,String> substitutions;

    public Map<String,String> substitutions() {
        return this.substitutions;
    }

    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     * 
     */
    @Import(name="tags", required=true)
      private final List<String> tags;

    public List<String> tags() {
        return this.tags;
    }

    /**
     * Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
     * 
     */
    @Import(name="timeout", required=true)
      private final String timeout;

    public String timeout() {
        return this.timeout;
    }

    /**
     * Stores timing information for phases of the build. Valid keys are: * BUILD: time to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or images, these keys will not be included.
     * 
     */
    @Import(name="timing", required=true)
      private final Map<String,String> timing;

    public Map<String,String> timing() {
        return this.timing;
    }

    /**
     * Non-fatal problems encountered during the execution of the build.
     * 
     */
    @Import(name="warnings", required=true)
      private final List<WarningResponse> warnings;

    public List<WarningResponse> warnings() {
        return this.warnings;
    }

    public BuildResponse(
        BuildApprovalResponse approval,
        ArtifactsResponse artifacts,
        SecretsResponse availableSecrets,
        String buildTriggerId,
        String createTime,
        FailureInfoResponse failureInfo,
        String finishTime,
        List<String> images,
        String logUrl,
        String logsBucket,
        String name,
        BuildOptionsResponse options,
        String project,
        String queueTtl,
        ResultsResponse results,
        List<SecretResponse> secrets,
        String serviceAccount,
        SourceResponse source,
        SourceProvenanceResponse sourceProvenance,
        String startTime,
        String status,
        String statusDetail,
        List<BuildStepResponse> steps,
        Map<String,String> substitutions,
        List<String> tags,
        String timeout,
        Map<String,String> timing,
        List<WarningResponse> warnings) {
        this.approval = Objects.requireNonNull(approval, "expected parameter 'approval' to be non-null");
        this.artifacts = Objects.requireNonNull(artifacts, "expected parameter 'artifacts' to be non-null");
        this.availableSecrets = Objects.requireNonNull(availableSecrets, "expected parameter 'availableSecrets' to be non-null");
        this.buildTriggerId = Objects.requireNonNull(buildTriggerId, "expected parameter 'buildTriggerId' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.failureInfo = Objects.requireNonNull(failureInfo, "expected parameter 'failureInfo' to be non-null");
        this.finishTime = Objects.requireNonNull(finishTime, "expected parameter 'finishTime' to be non-null");
        this.images = Objects.requireNonNull(images, "expected parameter 'images' to be non-null");
        this.logUrl = Objects.requireNonNull(logUrl, "expected parameter 'logUrl' to be non-null");
        this.logsBucket = Objects.requireNonNull(logsBucket, "expected parameter 'logsBucket' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.queueTtl = Objects.requireNonNull(queueTtl, "expected parameter 'queueTtl' to be non-null");
        this.results = Objects.requireNonNull(results, "expected parameter 'results' to be non-null");
        this.secrets = Objects.requireNonNull(secrets, "expected parameter 'secrets' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceProvenance = Objects.requireNonNull(sourceProvenance, "expected parameter 'sourceProvenance' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusDetail = Objects.requireNonNull(statusDetail, "expected parameter 'statusDetail' to be non-null");
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.substitutions = Objects.requireNonNull(substitutions, "expected parameter 'substitutions' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.timing = Objects.requireNonNull(timing, "expected parameter 'timing' to be non-null");
        this.warnings = Objects.requireNonNull(warnings, "expected parameter 'warnings' to be non-null");
    }

    private BuildResponse() {
        this.approval = null;
        this.artifacts = null;
        this.availableSecrets = null;
        this.buildTriggerId = null;
        this.createTime = null;
        this.failureInfo = null;
        this.finishTime = null;
        this.images = List.of();
        this.logUrl = null;
        this.logsBucket = null;
        this.name = null;
        this.options = null;
        this.project = null;
        this.queueTtl = null;
        this.results = null;
        this.secrets = List.of();
        this.serviceAccount = null;
        this.source = null;
        this.sourceProvenance = null;
        this.startTime = null;
        this.status = null;
        this.statusDetail = null;
        this.steps = List.of();
        this.substitutions = Map.of();
        this.tags = List.of();
        this.timeout = null;
        this.timing = Map.of();
        this.warnings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildApprovalResponse approval;
        private ArtifactsResponse artifacts;
        private SecretsResponse availableSecrets;
        private String buildTriggerId;
        private String createTime;
        private FailureInfoResponse failureInfo;
        private String finishTime;
        private List<String> images;
        private String logUrl;
        private String logsBucket;
        private String name;
        private BuildOptionsResponse options;
        private String project;
        private String queueTtl;
        private ResultsResponse results;
        private List<SecretResponse> secrets;
        private String serviceAccount;
        private SourceResponse source;
        private SourceProvenanceResponse sourceProvenance;
        private String startTime;
        private String status;
        private String statusDetail;
        private List<BuildStepResponse> steps;
        private Map<String,String> substitutions;
        private List<String> tags;
        private String timeout;
        private Map<String,String> timing;
        private List<WarningResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approval = defaults.approval;
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.buildTriggerId = defaults.buildTriggerId;
    	      this.createTime = defaults.createTime;
    	      this.failureInfo = defaults.failureInfo;
    	      this.finishTime = defaults.finishTime;
    	      this.images = defaults.images;
    	      this.logUrl = defaults.logUrl;
    	      this.logsBucket = defaults.logsBucket;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.project = defaults.project;
    	      this.queueTtl = defaults.queueTtl;
    	      this.results = defaults.results;
    	      this.secrets = defaults.secrets;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.source = defaults.source;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.statusDetail = defaults.statusDetail;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.timing = defaults.timing;
    	      this.warnings = defaults.warnings;
        }

        public Builder approval(BuildApprovalResponse approval) {
            this.approval = Objects.requireNonNull(approval);
            return this;
        }
        public Builder artifacts(ArtifactsResponse artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }
        public Builder availableSecrets(SecretsResponse availableSecrets) {
            this.availableSecrets = Objects.requireNonNull(availableSecrets);
            return this;
        }
        public Builder buildTriggerId(String buildTriggerId) {
            this.buildTriggerId = Objects.requireNonNull(buildTriggerId);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder failureInfo(FailureInfoResponse failureInfo) {
            this.failureInfo = Objects.requireNonNull(failureInfo);
            return this;
        }
        public Builder finishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }
        public Builder images(List<String> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        public Builder logUrl(String logUrl) {
            this.logUrl = Objects.requireNonNull(logUrl);
            return this;
        }
        public Builder logsBucket(String logsBucket) {
            this.logsBucket = Objects.requireNonNull(logsBucket);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder options(BuildOptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder queueTtl(String queueTtl) {
            this.queueTtl = Objects.requireNonNull(queueTtl);
            return this;
        }
        public Builder results(ResultsResponse results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder secrets(List<SecretResponse> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(SecretResponse... secrets) {
            return secrets(List.of(secrets));
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder source(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourceProvenance(SourceProvenanceResponse sourceProvenance) {
            this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = Objects.requireNonNull(statusDetail);
            return this;
        }
        public Builder steps(List<BuildStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(BuildStepResponse... steps) {
            return steps(List.of(steps));
        }
        public Builder substitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder timing(Map<String,String> timing) {
            this.timing = Objects.requireNonNull(timing);
            return this;
        }
        public Builder warnings(List<WarningResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(WarningResponse... warnings) {
            return warnings(List.of(warnings));
        }        public BuildResponse build() {
            return new BuildResponse(approval, artifacts, availableSecrets, buildTriggerId, createTime, failureInfo, finishTime, images, logUrl, logsBucket, name, options, project, queueTtl, results, secrets, serviceAccount, source, sourceProvenance, startTime, status, statusDetail, steps, substitutions, tags, timeout, timing, warnings);
        }
    }
}
